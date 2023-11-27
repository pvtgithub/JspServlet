package bai3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = new DBConnection().getConnect();
        }catch (Exception ex){}

        return con;
    }

    public List<Product> getAllProduct(){
        List<Product> listProduct = new ArrayList<>();
        Connection con = null;
        try{
            con = ProductDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from product");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String image = rs.getString(3);
                double price = rs.getDouble(4);
                Product pr = new Product(id,name,image,price);

                listProduct.add(pr);
            }
            con.close();
        }catch (Exception e){}

        return listProduct;
    }
}
