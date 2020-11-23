package controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationDao {

    private final String dburl = "jdbc:mysql://localhost:3306/site_db?useUnicode=true&serverTimezone=UTC";
    private final String dbuname = "nikita";
    private final String dbpassword = "123456Qw";
    private final String dbdriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class<?> fn = Class.forName(dbDriver);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationDao.class.getName()).log(Level.SEVERE, "!!!!!!", ex);
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {

            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public String insert(member member) {
        loadDriver(dbdriver);
        Connection con = getConnection();
        String result = "Data entered successfully";
        String sql = "insert into site_db.member (uname,email,password) values (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDao.class.getName()).log(Level.SEVERE, null, ex);
            result = "Data not entered";
        }

        return result;

    }
}
