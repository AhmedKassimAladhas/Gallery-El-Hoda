/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Controls.Tools;
import DB.MethodsDB;
import java.sql.Date;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class ReturnBill {

    private int id;
    private int numberBill;
    private int numberLine;
    private Date date_return;
    private String seller_emp;
    private String sec;
    private String cat;
    private String color;
    private int count;
    private Double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberBill() {
        return numberBill;
    }

    public void setNumberBill(int numberBill) {
        this.numberBill = numberBill;
    }

    public int getNumberLine() {
        return numberLine;
    }

    public void setNumberLine(int numberLine) {
        this.numberLine = numberLine;
    }

    public Date getDate_return() {
        return date_return;
    }

    public void setDate_return(Date date_return) {
        this.date_return = date_return;
    }

    public String getSeller_emp() {
        return seller_emp;
    }

    public void setSeller_emp(String seller_emp) {
        this.seller_emp = seller_emp;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void add() {
        String sql = "insert into returnbill values(" + id + ", " + numberBill + ", " + numberLine + ", '" + date_return + "', '" + seller_emp + "','" + sec + "','" + cat + "','" + color + "', " + count + ", '" + cost + "')";
        boolean ifAdd = MethodsDB.runNunQuery(sql);
        if (ifAdd) {
            Tools.msgbox("تم التسجيل بنجاح");
        }
    }

    public void delete(String id) {
        String sql = "delete from returnbill where id=" + id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if (ifDelete) {
            Tools.msgbox("تم الحذف بنجاح");
        }
    }

    public void getAllReturnBill(JTable table) {
        MethodsDB.fillToTable("select cost,count,color,cat,sec,seller_emp,date_today,number_bill,id from returnbill ", table);
    }
}
