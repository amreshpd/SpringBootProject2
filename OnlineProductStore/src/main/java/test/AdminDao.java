package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {
	public AdminBean ad = null;

	public AdminBean login(String uName, String pWord) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from admin60 where UNAME=? AND PWORD=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ad = new AdminBean();
				ad.setuName(rs.getString(1));
				ad.setpWord(rs.getString(2));
				ad.setfName(rs.getString(3));
				ad.setlName(rs.getString(4));
				ad.setAddress(rs.getString(5));
				ad.setMailId(rs.getString(6));
				ad.setPhoneNo(rs.getLong(7));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ad;
	}
}