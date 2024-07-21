package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
	public int k=0;
	public int insert(UserBean ub) {
		try {
		Connection con = DBConection.getCon();
		PreparedStatement ps = con.prepareStatement("insert into userreg60 values(?,?,?,?,?,?,?)");
		ps.setString(1, ub.getuName());
		ps.setString(2, ub.getpWord());
		ps.setString(3, ub.getfName());
		ps.setString(4, ub.getlName());
		ps.setString(5, ub.getmId());
		ps.setString(6, ub.getAddress());
		ps.setLong(7, ub.getPhoneNo());
		 k = ps.executeUpdate();
		
		}catch (Exception e) {
		e.printStackTrace();
		}
		
		return k;
	}	
}
