package Controls;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tools {

    public static void clearText(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                clearText((Container) c);
            }
        }
    }

    public static void setReport(JTable table) {
        table.getTableHeader().setBackground(new java.awt.Color(0, 0, 90));
        table.getTableHeader().setForeground(java.awt.Color.WHITE);
    }

    public static void printReport(JTable table, String titel) {
        try {
            MessageFormat header = new MessageFormat(titel + " Report");
            MessageFormat footer = new MessageFormat("Page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    public static void msgbox(String Message) {
        JOptionPane.showMessageDialog(null, Message);
    }
    
    public static void tableUI(JTable table) {
        table.getTableHeader().setBackground(new Color(33, 33, 33));
        table.getTableHeader().setForeground(new Color(154, 218, 250));
        table.getTableHeader().setFont(new Font("Tahoma", 13, 16));
        table.setGridColor(new Color(154, 218, 250));
        table.setBackground(new Color(117, 117, 117));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Tahoma", 13, 14));
        table.getTableHeader().setReorderingAllowed(false);
    }
}
