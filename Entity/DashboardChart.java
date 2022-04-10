/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DB.ConectionDB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ahmed
 */
public class DashboardChart {

    public Map<String, String> getCountBill() {
        Map<String, String> map = new HashMap<>();
        try {
            Connection con = ConectionDB.setcon();
            Statement st = con.createStatement();
            String sql = "select * from billdate";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                map.put("date_today", rs.getString("date_today"));
                map.put("count", rs.getString("showdate"));
            }

            return map;

        } catch (Exception ex) {

        }
        return map;
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        String jan = "";
//        String feb = "";
//        String mar = "";
//        String apr = "";
//        String may = "";
//        String jun = "";
//        String jul = "";
//        String aug = "";
//        String sep = "";
//        String oct = "";
//        String nov = "";
//        String dec = "";
        try {
            String d = "لا";
            int c = 0;

            Connection con = ConectionDB.setcon();
            Statement st = con.createStatement();

            String sql = "select * from billdate";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                c = Integer.parseInt(rs.getString("count"));
                d = rs.getString("date_today");

                dataset.addValue(c, "الفواتير", d);
            }
            con.close();

        } catch (Exception e) {

        }

        return dataset;

    }

    public void getBarChart(JPanel panel) {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        String year = f.format(d);

        // Create Dataset  
        CategoryDataset dataset = createDataset();

        //Create chart  
        JFreeChart chart = ChartFactory.createBarChart(
                "إحصائيات سنة " + year, //Chart Title  
                "  الشهر", // Category axis  
                "اعداد الفواتير", // Value axis  
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        String path = "src\\Images\\chartPic.jpg";
        ImageIcon img = new ImageIcon(path);
        Image im = img.getImage();
        chart.setBackgroundImage(im);
        chart.setBorderPaint(Color.WHITE);
//        chart.getTitle().setPaint(new Color(154, 218, 250));

        CategoryPlot plot = chart.getCategoryPlot();
        /*plot.getDomainAxis().setAxisLinePaint(new Color(154, 218, 250));
        plot.getDomainAxis().setTickMarkPaint(new Color(154, 218, 250));
        plot.getDomainAxis().setTickLabelPaint(new Color(154, 218, 250));
        plot.getDomainAxis().setLabelPaint(new Color(154, 218, 250));
        plot.getDomainAxis().setLabelFont(new Font("Tahoma", 17, 20));
        plot.getDomainAxis().setTickLabelFont(new Font("Tahoma", 8, 10));

        plot.getRangeAxis().setAxisLinePaint(new Color(154, 218, 250));
        plot.getRangeAxis().setTickMarkPaint(new Color(154, 218, 250));
        plot.getRangeAxis().setTickLabelPaint(new Color(154, 218, 250));
        plot.getRangeAxis().setLabelPaint(new Color(154, 218, 250));
        plot.getRangeAxis().setLabelFont(new Font("Tahoma", 17, 20));
        plot.getRangeAxis().setTickLabelFont(new Font("Tahoma", 12, 15));*/

        plot.setBackgroundImage(im);
//        plot.setBackgroundPaint(new Color(1, 87, 155));
        plot.setOutlinePaint(new Color(154, 218, 250));

//        ChartFrame fram = new ChartFrame("2020", chart, false);
        ChartPanel chartPanel = new ChartPanel(chart);

        panel.removeAll();
        panel.add(chartPanel);
        panel.updateUI();
    }
}
