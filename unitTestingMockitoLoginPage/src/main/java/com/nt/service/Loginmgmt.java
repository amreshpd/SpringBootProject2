package com.nt.service;

import com.nt.dao.ILoginDao;

public class Loginmgmt implements LoginMgmtService {

	
	private ILoginDao loginDao;
	
	public Loginmgmt(ILoginDao loginDao) {
		this.loginDao=loginDao;
	}
	
	@Override
	public boolean login(String uname, String pwd) {
	if(uname.equals("") || pwd.equals(""))
		throw new IllegalArgumentException("empty credentials");
	  //use LoginDao
	int count=loginDao.authentication(uname, pwd);
	System.out.println("service:: login::count"+count);
	if(count==0)
	    return false;
	else
		return true;
	}

	public String registerUser(String user,String role) {
		if(!role.equalsIgnoreCase("") && !role.equalsIgnoreCase("visitor")) {
			loginDao.addUser(user, role);
			return "user added";
		}else {
			return "user not added";
		}
	}
	
}
