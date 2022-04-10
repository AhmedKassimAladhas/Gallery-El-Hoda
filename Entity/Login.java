/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DB.ConnectionDB;
import Forms.AccountsFrm;
import Forms.HomeFrm;
import static Forms.SaleFrm.nameSale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ahmed
 */
public class Login {

    private String username;
    private String password;

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

    public boolean loginGO() {
        try {
            String name;
            String uname;
            String sql = "select * from users where Username = '" + username + "' And Password = '" + password + "'";
            Connection con = ConnectionDB.setConn();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("succses");
                name = rs.getString("name");
                uname = rs.getString("username");
                HomeFrm.name.setText(name);
                AccountsFrm.nameExp.setText(name);
                nameSale.setText(name);
                //HomeFrm.uname.setText(uname);
                return true;
            } else {
                System.out.println("error");
            }
        } catch (SQLException ex) {

        }
        return false;
    }

    public String getPass(String username) {
        String pas = "";
        try {

            String sql = "select * from users where username = '" + username + "'";
            Connection con = ConnectionDB.setConn();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                pas = rs.getString("password");

            }
            return pas;
        } catch (SQLException ex) {

        }
        return pas;
    }
}
