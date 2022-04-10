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
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class Store {

    public void getAllStored(JTable table) {
        MethodsDB.fillToTable("select notes,count,color,model,section,Stored_Name,number from categories", table);
    }

    public void getBySearch(String search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where notes like'%" + search + "%' or count like'%" + search + "%'"
                        + " or model like'%" + search + "%' or section like'%" + search + "%'", table);
    }

    public void getByOneDate(Date search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where date_today like'%" + search + "%'", table);
    }

    public void getByManyDate(Date searchFrom, Date searchTo, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where date_today between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getByModel(String search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where model like'%" + search + "%'", table);
    }

    public void getBySections(String search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where section like'%" + search + "%'", table);
    }

    public void getByStore(String search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where Stored_Name like'%" + search + "%'", table);
    }
    
    public void getFinishProd(JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where count =" + 0, table);
    }

    public void getOneProd(JTable table) {
        MethodsDB
                .fillToTable("select notes,count,color,model,section,Stored_Name,number from categories "
                        + " where count =" + 1, table);
    }

    public Map<String, String> getCost(String cat) {
        Map<String, String> cost = new HashMap<>();
        try {
            Connection con = ConnectionDB.setConn();
            Statement st = con.createStatement();
            String sql = "select buy_price,sale_price from stored where category like '%" + cat + "%'";
            ResultSet rs = st.executeQuery(sql);

            String buy = "";
            String sale = "";
            while (rs.next()) {
                buy = rs.getString("buy_price");
                sale = rs.getString("sale_price");
            }
            cost.put("buy", buy);
            cost.put("sale", sale);

        } catch (Exception e) {

        }
        return cost;
    }

    public void getAll(JTable table) {
        MethodsDB.fillToTable("select notes,count,Stored_Name,Price_Sale,Price_Buy,color,model,section,Barcode,number from categories", table);
    }
}
