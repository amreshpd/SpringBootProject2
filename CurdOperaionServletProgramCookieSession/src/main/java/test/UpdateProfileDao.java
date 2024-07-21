package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDao {
     public int k=0;
     
     public int update(UserBean ub) {
    	 try {
    		 Connection con = DBConection.getCon();
    		 PreparedStatement ps = con.prepareStatement("update userReg60 set ADDRESS=?,MID=?,PHNO=? where uname=? AND pword=?");
    	    ps.setString(1, ub.getAddress());
    	    ps.setString(2, ub.getmId());
    	    ps.setLong(3, ub.getPhoneNo());
    	    ps.setString(4, ub.getuName());
    	    ps.setString(5, ub.getpWord());
    	    k=ps.executeUpdate();
    	 }catch (Exception e) {
			System.out.println(e.toString());
		}   	 
    	 return k;
     }
}
