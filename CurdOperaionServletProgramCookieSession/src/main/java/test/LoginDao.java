package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public UserBean ub=null;
	
	public UserBean login(String uName,String pWord) {
		try {
		Connection con = DBConection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from userreg60 where uname=? AND pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ub=new UserBean();
				ub.setuName(rs.getString(1));
				ub.setpWord(rs.getString(2));
				ub.setfName(rs.getString(3));
				ub.setlName(rs.getString(4));
				ub.setmId(rs.getString(5));
				ub.setAddress(rs.getString(6));
				ub.setPhoneNo(rs.getLong(7));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ub;
	}
}
