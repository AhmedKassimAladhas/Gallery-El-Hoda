/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ahmed
 */
public class Tools {

    public static void msgbox(String Message) {
        JOptionPane.showMessageDialog(null, Message);
    }

    public static boolean confirmMsg(String message) {
        int confmsg = JOptionPane.showConfirmDialog(null, message);
        if (confmsg == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static void clearText(Container Form) {
        for (Component c : Form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                clearText((Container) c);
            }
        }
    }

    public static void openFram(JFrame form) {
        try {
            form.setLocationRelativeTo(null);
            form.setDefaultCloseOperation(2);
            Image im = ImageIO.read(Tools.class.getResource("/Images/minlo.png"));
            form.setIconImage(im);
            form.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printScreen(String imgName, JFrame form) {
        try {
            form.setState(1);
            Robot t = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = t.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(imgName + ".jpg"));
            form.setState(0);
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void tableUI(JTable table, int ColumnCount) {
        table.getTableHeader().setBackground(new Color(26, 2, 2));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 16));
        //table.setGridColor(new Color(154, 218, 250));
        //table.setBackground(new Color(117, 117, 117));
        //table.setForeground(Color.WHITE);
        table.setFont(new Font("Calibri", Font.BOLD, 15));
        table.setRowHeight(25);
        table.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer drc = new DefaultTableCellRenderer();
        drc.setHorizontalAlignment(SwingConstants.CENTER);
        TableCellRenderer t;
        t = drc;
        int c = ColumnCount;
        for (int i = 0; i <= c; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(t);
            
        }
    }

    public static boolean ifNumber(String in) {
        try {
            Integer.parseInt(in);
            return true;
        } catch (Exception e) {
            Tools.msgbox("يجب ادخال العدد بشكل صحيح !!");
            return false;
        }
    }
}
