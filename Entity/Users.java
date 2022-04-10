/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Controls.Tools;
import DB.ConnectionDB;
import DB.MethodsDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class Users {
    private int id;
    private String name;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void add() {
        String sql = "insert into users values(" + id + ",'" + name + "','" + username + "','" + password + "')";
        /*boolean ifAdd = MethodsDB.runNunQuery(sql);
        if (ifAdd) {
            Tools.msgbox("تم حفظ البيانات بنجاح");
        }*/
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            Tools.msgbox("تم حفظ البيانات بنجاح");
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 2627) {
                JOptionPane.showMessageDialog(null, "أسم المستخدم موجود من قبل !!   لم يتم حفظ البيانات", "خطأ", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

    public void update() {
        String sql = "update users set name='" + name + "', username='" + username + "', password='" + password + "' where number=" + id;

        /*boolean ifupdate = MethodsDB.runNunQuery(sql);
        if (ifupdate) {
            Tools.msgbox("تم تعديل البيانات");
        } else {
            Tools.msgbox("لم يتم تعديل البيانات");
        }*/
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            Tools.msgbox("تم تعديل البيانات بنجاح");
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 2627) {
                JOptionPane.showMessageDialog(null, "إسم المستخدم موجود من قبل !!", "خطأ", JOptionPane.WARNING_MESSAGE);
                Tools.msgbox("لم يتم تعديل البيانات");
            }
        }
    }

    public void delete(String id) {
        String sql = "delete from users where number=" + id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if (ifDelete) {
            Tools.msgbox("تم الحذف بنجاح");
        }
    }
    
    public void getAllRows(JTable table) {
        MethodsDB.fillToTable("select password,username,name,number from users", table);
    }
}
