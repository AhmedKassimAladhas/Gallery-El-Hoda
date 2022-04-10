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
public class ConnectionDB {

    public static Connection conn = null;

    public static Connection setConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/store"+"?useUnicode=true&characterEncoding=UTF-8","root","");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "يجب تشغيل قاعدة البيانات!!");
            return null;
        }
    }
}
