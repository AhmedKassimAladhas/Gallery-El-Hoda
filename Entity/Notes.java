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
public class Notes {

    private int id;
    private String date;
    private String name;
    private double cost;
    private String phone;
    private String payment;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void add() {
        String sql = "insert into notes values(" + id + ",'" + date + "','" + name + "','" + cost + "','" + phone + "','" + payment + "','" + notes + "')";
        boolean ifAdd = DB.MethodsDB.runNunQuery(sql);
        if (ifAdd) {
            Tools.msgbox("تم الحفظ بنجاح");
        }
    }

    public void update() {
        String sql = "update notes set date_today='" + date + "' , name='" + name + "', cost='" + cost + "', phone='" + phone + "', notes='" + notes + "' where id=" + id;

        boolean ifupdate = MethodsDB.runNunQuery(sql);
        if (ifupdate) {
            Tools.msgbox("تم تعديل البيانات");
        } else {
            Tools.msgbox("لم يتم تعديل البيانات");
        }
    }

    public void delete(String id) {
        String sql = "delete from notes where id=" + id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if (ifDelete) {
            Tools.msgbox("تم الحذف ");
        }
    }

    public void Payment(String id) {
        String sql = "update notes set Payment_status='" + "سدد" + "' where id=" + id;

        boolean ifupdate = MethodsDB.runNunQuery(sql);
        if (ifupdate) {
            Tools.msgbox("تم تعديل البيانات");
        } else {
            Tools.msgbox("لم يتم تعديل البيانات");
        }
    }

    public void getAllRows(JTable table) {
        MethodsDB.fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes", table);
    }

    public void getAllRowsNotPayment(JTable table) {
        MethodsDB.fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes where Payment_status = 'لم يسدد'", table);
    }

    public void getAllRowsOld(JTable table) {
        MethodsDB.fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes where Payment_status = 'سدد'", table);
    }

    public void getBySearch(String search, String payment, JTable table) {
        MethodsDB
                .fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes"
                        + " where name like'%" + search + "%' or phone like'%" + search + "%' or date_today like'%" + search + "%'"
                        + " or Payment_status like'%" + search + "%' and Payment_status ='" + payment + "'", table);
    }

    public void getBillByOneDate(String search, String payment, JTable table) {
        MethodsDB
                .fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes "
                        + " where date_today='" + search + "' and Payment_status ='" + payment + "'", table);
    }

    public void getBillByManyDate(String searchFrom, String searchTo, String payment, JTable table) {
        MethodsDB
                .fillToTable("select notes,Payment_status,phone,cost,name,date_today,id from notes "
                        + " where date_today between '" + searchFrom + "' and '" + searchTo + "' and Payment_status ='" + payment + "'", table);
    }
}
