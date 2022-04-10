/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Controls.Tools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class MethodsDB {

    public static boolean runNunQuery(String statement) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            st.execute(statement);
            con.close();
            return true;
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Error :" + ex.getErrorCode());
            if (ex.getErrorCode() == 2627) {
                JOptionPane.showMessageDialog(null, "تم حفظ البيانات من قبل !!", "خطأ", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }

    /*public static void fillCompo(String tableName, String ColumnName, JComboBox combo) {
        try {
            Connection con = ConnectionDB.setConn();
            String strs = "SELECT " + ColumnName + " FROM " + tableName;
            PreparedStatement st = con.prepareStatement(strs);
            ResultSet r = st.executeQuery();
            
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
    }*/
    public static void fillCompo(String tableName, String ColumnName, JComboBox combo) {
        try {
            Connection con = DB.ConnectionDB.setConn();
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

    public static void fillCompo2(String table, String column, String CondColumn, Object text, JComboBox combo) {
        try {
            Connection con = DB.ConnectionDB.setConn();
            Statement st = con.createStatement();
            String strs = "select " + column + " from " + table + " where " + CondColumn + " = '" + text + "'";
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

    public static void fillCompo3(String table, String column, String CondColumn1, Object text1, JComboBox combo) {
        try {
            Connection con = ConnectionDB.setConn();
            String strs = "select " + column + " from " + table + " where " + CondColumn1 + " = '" + text1 + "'  order by number";
            PreparedStatement st = con.prepareStatement(strs);

            ResultSet r = st.executeQuery();
            //r.last();
            //int c = r.getRow();
            //r.beforeFirst();
            //String values[] = new String[c];
            //int i = 0;
            while (r.next()) {
                //values[i] = r.getString(1);
                //i++;
                String name = r.getString(column);
                combo.addItem(name);
            }
            con.close();
            //combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static void fillCompo4(String table, String column, String CondColumn1, String CondColumn2, String CondColumn3, Object text1, Object text2, Object text3, JComboBox combo) {
        try {
            Connection con = ConnectionDB.setConn();
            String strs = "select " + column + " from " + table + " where " + CondColumn1 + " != '" + text1 + "' and " + CondColumn2 + " = '" + text2 + "' and " + CondColumn3 + " = '" + text3 + "' order by number";
            PreparedStatement st = con.prepareStatement(strs);

            ResultSet r = st.executeQuery();
            //r.last();
            //int c = r.getRow();
            //r.beforeFirst();
            //String values[] = new String[c];
            //int i = 0;
            while (r.next()) {
                //values[i] = r.getString(1);
                //i++;
                String name = r.getString(column);
                combo.addItem(name);
            }
            con.close();
            //combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static String getAutoNumber(String tableName, String columnName) {
        try {
            Connection con = DB.ConnectionDB.setConn();
            Statement stm = con.createStatement();
            String stAuto = "select max(" + columnName + ")+1 as autonum"
                    + " from " + tableName;
            stm.executeQuery(stAuto);
            String Num = "";
            while (stm.getResultSet().next()) {
                Num = stm.getResultSet().getString("autonum");
            }
            con.close();
            if (Num == null || "".equals(Num)) {
                return "1";
            } else {
                return Num;
            }
        } catch (SQLException ex) {
            Tools.msgbox(ex.getMessage());
        }
        return "0";
    }

    public static String auto(String tableName, String columnName, String conColumn, String txt) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement stm = con.createStatement();
            String sqls = "select max(" + columnName + ")+1 as autnum from " + tableName + " where " + conColumn + " = " + txt;
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

    public static void fillToTable(String tableNameOrSelectStatement, JTable table) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement stm = con.createStatement();
            ResultSet rs;
            String strselect;
            if ("select ".equals(tableNameOrSelectStatement.substring(0, 7).toLowerCase())) {
                strselect = tableNameOrSelectStatement;
            } else {
                strselect = "select * from " + tableNameOrSelectStatement;
            }
            rs = stm.executeQuery(strselect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if (table.getColumnCount() != c) {
                Tools.msgbox("JTable Columns Count Not Equal To Query");
            }
            con.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 207) {
                Tools.msgbox("يجب ادخال رقم العقد صحيح !!");
            } else {
                Tools.msgbox(ex.getMessage());
            }

        }
    }
}
