/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class ConectionDB {
public static Connection conn = null;
public static Connection setcon(){

    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market"+"?useUnicode=true&characterEncoding=UTF-8","root","");
        System.out.println("Connection Succses");
        return conn;
    }catch(Exception ex){
        System.out.println("Connection Error !");
        JOptionPane.showMessageDialog(null, "Connectin Error");
        return null;
    }
}
}
