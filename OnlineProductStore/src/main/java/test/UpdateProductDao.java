package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDao {
	public int k = 0;

	public int update(ProductBean pb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("upadte product60 set price=?,Qty=? where code=?");
			ps.setDouble(1, pb.getPrice());
			ps.setInt(2, pb.getQuantity());
			ps.setString(3, pb.getCode());
			k = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return k;
	}
}
