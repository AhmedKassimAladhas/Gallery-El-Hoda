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
public class Expenses {

    private int id;
    private Date date_today;
    private String emp;
    private String exp;
    private Double cost;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_today() {
        return date_today;
    }

    public void setDate_today(Date date_today) {
        this.date_today = date_today;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void add() {
        String sql = "insert into expenses values(" + id + ",'" + emp + "','" + date_today + "','" + exp + "','" + cost + "','" + notes + "')";
        boolean ifAdd = MethodsDB.runNunQuery(sql);
        if (ifAdd) {
            Tools.msgbox("تم التسجيل بنجاح");
        }
    }

    public void delete(String id) {
        String sql = "delete from expenses where number=" + id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if (ifDelete) {
            Tools.msgbox("تم الحذف بنجاح");
        }
    }

    public void getExpensesToday(JTable table, Date date) {
        MethodsDB.fillToTable("select notes,Price,Expenses,EmpName,DateExp,number from expenses  where DateExp= '" + date + "'", table);
    }

    public void getAllExpenses(JTable table) {
        MethodsDB.fillToTable("select notes,Price,Expenses,EmpName,DateExp,number from expenses ", table);
    }
}
