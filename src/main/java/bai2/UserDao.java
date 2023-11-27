package bai2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = new DBConnection().getConnect();//mo ket noi voi sql
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public int delete(int id) {
        int res = 0;
        Connection con = null;
        try {
            con = UserDao.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from users where id = ?");
            ps.setInt(1, id);
            res = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
        }
        return res;
    }

    public int save(User us) {
        int res = 0;
        Connection con = null;
        try {
            con = UserDao.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into users(name,password,email,sex,country) values (?,?,?,?,?)");
            ps.setString(1, us.getName());
            ps.setString(2, us.getPassword());
            ps.setString(3, us.getEmail());
            ps.setString(4, us.getSex());
            ps.setString(5, us.getCountry());
            res = ps.executeUpdate();

            con.close();
        } catch (Exception e) {

        }
        return res;
    }

    public List<User> getAllUser() {
        Connection con = UserDao.getConnection();
        List<User> listUser = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setPassword(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setSex(rs.getString(5));
                us.setCountry(rs.getString(6));
                listUser.add(us);
            }
            con.close();
        } catch (Exception ex) {

        }

        return listUser;
    }

    public User getOneUser(int id) {
        User us = new User();
        Connection con = null;
        try {
            con = UserDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from users where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setPassword(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setSex(rs.getString(5));
                us.setCountry(rs.getString(6));
            }
            con.close();
        } catch (Exception e) {

        }
        return us;
    }

    public int update(int id,User us) {
        int res = 0;
        Connection con = null;
        try{
            con = UserDao.getConnection();
            PreparedStatement ps = con.prepareStatement("update users set name=?,password=?,email=?,sex=?,country=? where id=?");

            ps.setString(1,us.getName());
            ps.setString(2,us.getPassword());
            ps.setString(3,us.getEmail());
            ps.setString(4,us.getSex());
            ps.setString(5,us.getCountry());
            ps.setInt(6,id);
            res = ps.executeUpdate();

        }catch (Exception e){}

        return res;
    }
}
