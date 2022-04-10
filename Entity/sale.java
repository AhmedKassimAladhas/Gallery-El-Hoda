/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Controls.Tools;
import DB.MethodsDB;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class sale {

    private int bill;
    private String time;
    private String date;
    private double price_buy;
    private double totalbill;
    private double discount;
    private double total;
    private int custm;

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice_buy() {
        return price_buy;
    }

    public void setPrice_buy(double price_buy) {
        this.price_buy = price_buy;
    }

    public double getTotalbill() {
        return totalbill;
    }

    public void setTotalbill(double totalbill) {
        this.totalbill = totalbill;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCustm() {
        return custm;
    }

    public void setCustm(int custm) {
        this.custm = custm;
    }

    public void add() {
        String sql = "insert into users values(" + bill + ",'" + time + "','" + date + "','" + price_buy + "','" + totalbill + "','" + discount + "','" + total + "','" + custm + "')";
        boolean ifAdd = DB.MethodsDB.runNunQuery(sql);
        if (ifAdd) {
            Tools.msgbox("تم حفظ الفاتورة بنجاح");
        }
    }

    public void getBillLine(String id, JTable table) {
        MethodsDB.fillToTable("SELECT price,count,section,model,numberbill,number FROM BILLLINE WHERE NUMBERBILL=" + id, table);
    }
}
