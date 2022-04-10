/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DB.ConectionDB;
import DB.GoDB;
import java.sql.Date;
import java.util.HashMap;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ahmed
 */
public class Reports {

    public void setReport(String report, HashMap pram) {
        try {
            String path = "src\\Reports\\" + report + ".jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint j = JasperFillManager.fillReport(jr, pram, ConectionDB.setcon());
            JasperViewer.viewReport(j, false);
            JasperExportManager.exportReportToPdfStream(j, null);
        } catch (Exception e) {

        }
    }

    public void getAccByOneDate(String search, JTable table) {
        GoDB
                .fillToTable("select total_after,total_before,total,discount,totalbilll,total_buy,EmpName,timebill,datebill,numberbill from accountsbill "
                        + " where datebill='" + search + "'", table);
    }

    public void getAccByManyDate(String searchFrom, String searchTo, JTable table) {
        GoDB
                .fillToTable("select total_after,total_before,total,discount,totalbilll,total_buy,EmpName,timebill,datebill,numberbill from accountsbill "
                        + " where datebill between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllAccountsBillLineOne(String search, JTable table) {
        GoDB
                .fillToTable("select total,total_sale,total_buy,price_sale,price_buy,measuring,count,category,numberbill,date_today from accountsbillline "
                        + " where date_today='" + search + "'", table);
    }

    public void getAllAccountsBillLineMany(String searchFrom, String searchTo, JTable table) {
        GoDB
                .fillToTable("select total,total_sale,total_buy,price_sale,price_buy,measuring,count,category,numberbill,date_today from accountsbillline "
                        + " where date_today between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllAccountsDayOne(String search, JTable table) {
        GoDB
                .fillToTable("select total_after,total_before,total,discount,expense,total_bill,total_buy,DateBill from accountsday "
                        + " where DateBill='" + search + "'", table);
    }

    public void getAllAccountsDayMany(String searchFrom, String searchTo, JTable table) {
        GoDB
                .fillToTable("select total_after,total_before,total,discount,expense,total_bill,total_buy,DateBill from accountsday"
                        + " where DateBill between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllStored(JTable table) {
        GoDB
                .fillToTable("select notes,count,measuring,Expierd_Date,Price_Sale,Price_Buy,category,section,Barcode,number from categories", table);
    }
}
