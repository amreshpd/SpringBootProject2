package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllProductDao {
	public ArrayList<ProductBean> al = new ArrayList<>();

	public ArrayList<ProductBean> retrieveProduct() {

		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product60");
			ResultSet ex = ps.executeQuery();
			while (ex.next()) {
				ProductBean pb = new ProductBean();
				pb.setCode(ex.getString(1));
				pb.setName(ex.getString(2));
				pb.setPrice(ex.getDouble(3));
				pb.setQuantity(ex.getInt(4));
				al.add(pb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
