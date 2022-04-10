/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Controls.Tools;
import DB.ConnectionDB;
import DB.MethodsDB;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ahmed
 */
public class Storage {

    private int id;
    private String section;
    private String model;
    private double price_buy;
    private double price_sale;
    private String barcode;
    private String color;
    private byte[] image;
    private String storedName;
    private int count;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice_buy() {
        return price_buy;
    }

    public void setPrice_buy(double price_buy) {
        this.price_buy = price_buy;
    }

    public double getPrice_sale() {
        return price_sale;
    }

    public void setPrice_sale(double price_sale) {
        this.price_sale = price_sale;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getStoredName() {
        return storedName;
    }

    public void setStoredName(String storedName) {
        this.storedName = storedName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void add() {
        try {
            Connection con = ConnectionDB.setConn();
            PreparedStatement ps = con.prepareStatement("insert into categories(number,section,model,price_buy,price_sale,barcode,color,image,stored_name,count,notes)values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, section);
            ps.setString(3, model);
            ps.setDouble(4, price_buy);
            ps.setDouble(5, price_sale);
            ps.setString(6, barcode);
            ps.setString(7, color);
            ps.setBytes(8, image);
            ps.setString(9, storedName);
            ps.setInt(10, count);
            ps.setString(11, notes);
            ps.execute();

            Tools.msgbox("تم حفظ البيانات");
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 2627 || ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "هذا الموديل موجود من قبل !!   لم يتم حفظ البيانات", "خطأ", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

    public void update() {
        try {
            Connection con = ConnectionDB.setConn();
            PreparedStatement ps = con.prepareStatement("update categories set Section =?, Model=?, Price_Buy=?, Price_Sale=?, Barcode=?, Color=?, image=?, Stored_Name=?, Count=?, Notes=? where number=?");
            ps.setInt(11, id);
            ps.setString(1, section);
            ps.setString(2, model);
            ps.setDouble(3, price_buy);
            ps.setDouble(4, price_sale);
            ps.setString(5, barcode);
            ps.setString(6, color);
            ps.setBytes(7, image);
            ps.setString(8, storedName);
            ps.setInt(9, count);
            ps.setString(10, notes);
            ps.executeUpdate();

            Tools.msgbox("تم تعديل البيانات");
            ps.close();
        } catch (Exception ex) {
            Tools.msgbox("لم يتم تعديل البيانات");
        }
    }

    public void delete(String id) {
        String sql = "delete from categories where number=" + id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if (ifDelete) {
            Tools.msgbox("تم حذف الموديل");
        }
    }

    public void getAllRows(JTable table) {
        MethodsDB.fillToTable("select notes,count,stored_name,color,price_sale,price_buy,model,section,barcode,number from categories", table);
    }

    public void getBySearch(String search, JTable table) {
        MethodsDB
                .fillToTable("select notes,count,stored_name,color,price_sale,price_buy,model,section,barcode,number from categories"
                        + " where barcode like'%" + search + "%' or section like'%" + search + "%' or model like'%" + search + "%'"
                        + " or stored_name like'%" + search + "%'", table);
    }

    public void getImg(JLabel pic, String eid) {
        try {
            Connection con = DB.ConnectionDB.setConn();
            Statement stm = con.createStatement();
            String stAuto = "select *"
                    + " from categories where number=" + eid;
            stm.executeQuery(stAuto);
            byte[] imageByte = null;
            while (stm.getResultSet().next()) {
                imageByte = stm.getResultSet().getBytes("image");
            }
            if (imageByte == null) {
                pic.setIcon(null);
            } else {
//                new EmployeesFrm().profile = imageByte;
                setImage(imageByte);
                ImageIcon img = new ImageIcon(imageByte);
                Image imag = img.getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_AREA_AVERAGING);
                ImageIcon myimg = new ImageIcon(imag);
                pic.setIcon(myimg);
            }
        } catch (Exception ex) {
            //Tools.msgbox(ex.getMessage());
        }
    }
}
