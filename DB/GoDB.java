/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Controls.Tools;
import Forms.Home;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class GoDB {
    
    public static boolean checkUser(String user, String pass , JLabel name, JTextField name2, JTextField name3, JLabel job,JLabel job2){
    String sql = "select * from employees where Username = '"+user+"' And Password = '"+pass+"'";
        try {           
            Connection con = ConectionDB.setcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("succses");
                Home h = new Home();
                h.setVisible(true);
                name.setText(rs.getString(2));
                name2.setText(rs.getString(2));
                name3.setText(rs.getString(2));
                job.setText(rs.getString(3));
                job2.setText(rs.getString(3));
                return true;
            }else{
                System.out.println("error");
            }
        } catch (SQLException ex) {
            
        }
        return false;
    }
    
    public static boolean runNunQuery(String statement) {
        try {
            Connection con = ConectionDB.setcon();
            Statement st = con.createStatement();
            st.execute(statement);
            con.close();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
    
     public static String autoNumber(String tableName, String columnName) {
        try {
            Connection con = ConectionDB.setcon();
            Statement stm = con.createStatement();
            String sqls = "select max(" + columnName + ")+1 as autnum from " + tableName;
            ResultSet rs = stm.executeQuery(sqls);
            String num = "";
            while (rs.next()) {
                num = stm.getResultSet().getString("autnum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return "0";
    }

    public static void fillCompo(String tableName, String ColumnName, JComboBox combo) {
        try {
            Connection con = DB.ConectionDB.setcon();
            Statement st = con.createStatement();
            String strs = "SELECT " + ColumnName + " FROM " + tableName;
            ResultSet r = st.executeQuery(strs);
            r.last();
            int c = r.getRow();
            r.beforeFirst();
            String values[] = new String[c];
            int i = 0;
            while (r.next()) {
                values[i] = r.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static String auto(String tableName, String columnName, String conColumn, String txt) {
        try {
            Connection con = ConectionDB.setcon();
            Statement stm = con.createStatement();
            String sqls = "select max(" + columnName + ")+1 as autnum from " + tableName+" where "+conColumn+" = "+txt;
            ResultSet rs = stm.executeQuery(sqls);
            String num = "";
            while (rs.next()) {
                num = stm.getResultSet().getString("autnum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return "";
    }

    public static void fillCompo2(String table , String column, String CondColumn, Object text, JComboBox combo) {
        try {
            Connection con = DB.ConectionDB.setcon();
            Statement st = con.createStatement();
            String strs = "select "+column+" from "+table+" where "+CondColumn+" = '"+text+"'";
            ResultSet r = st.executeQuery(strs);
            r.last();
            int c = r.getRow();
            r.beforeFirst();
            String values[] = new String[c];
            int i = 0;
            while (r.next()) {
                values[i] = r.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static void icon(JFrame form) {

        try {
            Image im = ImageIO.read(GoDB.class.getResource("Micon.png"));
            form.setIconImage(im);
            
        } catch (IOException ex) {
            Logger.getLogger(GoDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void fillToTable(String tableNameOrSelectStatement, JTable table){
        try{
            Connection con = ConectionDB.setcon();
            Statement stm = con.createStatement();
            ResultSet rs;
            String strselect;
            if("select ".equals(tableNameOrSelectStatement.substring(0, 7).toLowerCase())){
                strselect = tableNameOrSelectStatement;
            }else{
                strselect = "select * from " + tableNameOrSelectStatement;
            }
            rs = stm.executeQuery(strselect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while(rs.next()){
                row = new Vector(c);
                for(int i = 1 ; i <= c; i++){
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if(table.getColumnCount() != c){
                Tools.msgbox("JTable Columns Count Not Equal To Query");
            }
            con.close();
        }
        catch(SQLException ex){
            Tools.msgbox(ex.getMessage());
            
        }
    }
}
