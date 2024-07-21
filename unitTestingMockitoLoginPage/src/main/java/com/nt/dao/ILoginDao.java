package com.nt.dao;

public interface ILoginDao {
	public int authentication(String username,String password);
	public int addUser(String user,String role);
}
