/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DB.ConnectionDB;
import DB.MethodsDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class Accounts {

    public void getAccByOneDate(Date search, JTable table) {
        MethodsDB
                .fillToTable("select total_after,total_before,total,discount,totalbilll,total_buy,empSaler,TimeBill,DateBill,NumberBill from accountsbill "
                        + " where DateBill='" + search + "'", table);
    }

    public void getAccByManyDate(Date searchFrom, Date searchTo, JTable table) {
        MethodsDB
                .fillToTable("select total_after,total_before,total,discount,totalbilll,total_buy,empSaler,TimeBill,DateBill,NumberBill from accountsbill "
                        + " where DateBill between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllAccountsBillLineOne(Date search, JTable table) {
        MethodsDB
                .fillToTable("select total,total_sale,total_buy,price_sale,price_buy,count,color,model,NumberBill,date_today from accountsbillline "
                        + " where date_today='" + search + "'", table);
    }

    public void getAllAccountsBillLineMany(Date searchFrom, Date searchTo, JTable table) {
        MethodsDB
                .fillToTable("select total,total_sale,total_buy,price_sale,price_buy,count,color,model,NumberBill,date_today from accountsbillline "
                        + " where date_today between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllAccountsDayOne(Date search, JTable table) {
        MethodsDB
                .fillToTable("select total_after,total_before,total,discount,expense,total_bill,total_buy,DateBill from accountsday "
                        + " where DateBill='" + search + "'", table);
    }

    public void getAllAccountsDayMany(Date searchFrom, Date searchTo, JTable table) {
        MethodsDB
                .fillToTable("select total_after,total_before,total,discount,expense,total_bill,total_buy,DateBill from accountsday"
                        + " where DateBill between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public String getAllDiscountOne(Date date) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(discount) as dis from accountsbill where DateBill='" + date + "'";
            ResultSet rs = st.executeQuery(sql);
            String discount = "0.0";
            while (rs.next()) {
                discount = rs.getString("dis");
                System.out.println("dis :" + discount);
            }
            return discount;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllDiscountMany(Date dateFrom, Date dateTo) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(discount) as dis from accountsbill where DateBill between '" + dateFrom + "' and '" + dateTo + "'";
            ResultSet rs = st.executeQuery(sql);
            String discount = "";
            while (rs.next()) {
                discount = rs.getString("dis");
                System.out.println("dis :" + discount);
            }
            return discount;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllExpensesOne(Date date) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(Price) as expCost from expenses where DateExp='" + date + "'";
            ResultSet rs = st.executeQuery(sql);
            String expCost = "0.0";
            while (rs.next()) {
                expCost = rs.getString("expCost");
                System.out.println("expCost :" + expCost);
            }
            return expCost;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllExpensesMany(Date dateFrom, Date dateTo) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(Price) as expCost from expenses where DateExp between '" + dateFrom + "' and '" + dateTo + "'";
            ResultSet rs = st.executeQuery(sql);
            String expCost = "0.0";
            while (rs.next()) {
                expCost = rs.getString("expCost");
                System.out.println("expCost :" + expCost);
            }
            return expCost;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllTotalBuytOne(Date date) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(total_buy) as buy from accountsbill where DateBill='" + date + "'";
            ResultSet rs = st.executeQuery(sql);
            String buy = "0.0";
            while (rs.next()) {
                buy = rs.getString("buy");
                System.out.println("buy :" + buy);
            }
            return buy;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllTotalBuyMany(Date dateFrom, Date dateTo) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(total_buy) as buy from accountsbill where DateBill between '" + dateFrom + "' and '" + dateTo + "'";
            ResultSet rs = st.executeQuery(sql);
            String buy = "0.0";
            while (rs.next()) {
                buy = rs.getString("buy");
                System.out.println("buy :" + buy);
            }
            return buy;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllTotalSaletOne(Date date) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(totalbilll) as sale from accountsbill where DateBill='" + date + "'";
            ResultSet rs = st.executeQuery(sql);
            String sale = "0.0";
            while (rs.next()) {
                sale = rs.getString("sale");
                System.out.println("sale :" + sale);
            }
            return sale;

        } catch (Exception e) {

        }
        return "0.0";
    }

    public String getAllTotalSaleMany(Date dateFrom, Date dateTo) {
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select sum(totalbilll) as sale from accountsbill where DateBill between '" + dateFrom + "' and '" + dateTo + "'";
            ResultSet rs = st.executeQuery(sql);
            String sale = "0.0";
            while (rs.next()) {
                sale = rs.getString("sale");
                System.out.println("sale :" + sale);
            }
            return sale;

        } catch (Exception e) {

        }
        return "0.0";
    }
}
