package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDao {
	public int k = 0;

	public int insert(ProductBean pb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into product60 values(?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setDouble(3, pb.getPrice());
			ps.setInt(4, pb.getQuantity());
			k = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return k;
	}
}