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
public class Bill {
    public void getBillByOneDate(Date search, JTable table) {
        MethodsDB
                .fillToTable("select total,discount,totalbilll,empSaler,TimeBill,DateBill,NumberBill from bill "
                        + " where DateBill='" + search + "'", table);
    }

    public void getBillByManyDate(Date searchFrom, Date searchTo, JTable table) {
        MethodsDB
                .fillToTable("select total,discount,totalbilll,empSaler,TimeBill,DateBill,NumberBill from bill  "
                        + " where DateBill between '" + searchFrom + "' and '" + searchTo + "'", table);
    }

    public void getAllBillLine(JTable table, String numberBill) {
        MethodsDB
                .fillToTable("select Price,count,price_sale,color,model,section,number,NumberBill,date_today from billline "
                        + " where NumberBill=" + numberBill, table);
    }
    
    public void getAllAccountsBillLine(JTable table, String numberBill) {
        MethodsDB
                .fillToTable("select total,total_sale,total_buy,price_sale,price_buy,count,color,model,NumberBill,date_today from accountsbillline "
                        + " where NumberBill=" + numberBill, table);
    }
    
    
    public void deleteBillLine(String id){
        String sql = "delete from billline where NumberBill="+id;
        MethodsDB.runNunQuery(sql);        
    }
    
    public void deleteBill(String id){
        String sql = "delete from bill where NumberBill="+id;
        boolean ifDelete = MethodsDB.runNunQuery(sql);
        if(ifDelete){
            Tools.msgbox("تم الحذف بنجاح");
        }
    }
}
