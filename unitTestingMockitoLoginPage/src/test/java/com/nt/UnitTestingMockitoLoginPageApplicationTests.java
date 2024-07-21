package com.nt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.dao.ILoginDao;
import com.nt.service.LoginMgmtService;
import com.nt.service.Loginmgmt;

@SpringBootTest
class UnitTestingMockitoLoginPageApplicationTests {
	
	private static ILoginDao loginDaoMock;
	private static LoginMgmtService loginService;
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("fake mock object created dynamically for IloginDao Interface");
		loginDaoMock=Mockito.mock(ILoginDao.class); //mock(-) generated inMemory class implementing
		     //create service class object           //IloginDao(i) having null method identification for authentication(-,-) method
	 	
		System.out.println(loginDaoMock.getClass()+" :::::::::::::"+Arrays.toString(loginDaoMock.getClass().getInterfaces()));
		loginService=new Loginmgmt(loginDaoMock);										
	 	
	}
	@AfterAll
	public static void clearOnce() {
		loginDaoMock=null;
		loginService=null;
	}
	//Test method
	
	@Test
	public void testLoginWithValidCredentials() {
		//provide stub [temporary functionalities] for DAO authentication method
		Mockito.when(loginDaoMock.authentication("Amresh", "Amresh1988")).thenReturn(1);
		assertTrue(loginService.login("Amresh", "Amresh1988"));
		
	}
	@Test
	public void testLoginWithInValidCredentials() {
		//provide stub [temporary functionalities] for DAO authentication method
		Mockito.when(loginDaoMock.authentication("Amresh", "Amresh1988")).thenReturn(0);
		assertFalse(loginService.login("Amresh", "Amresh1998"));
		
	}
	@Test
	public void testLoginWithNoCredentials() {
	assertThrows(IllegalArgumentException.class,()->{loginService.login("", "");});
	
	}
	@Test
	public void testRegisterWithSpy() {
	ILoginDao loginDaoSpy=Mockito.spy(ILoginDao.class);	
	Loginmgmt loginService=new Loginmgmt(loginDaoSpy);
	loginService.registerUser("ak", "admin");
	loginService.registerUser("bk", "admin1");
	loginService.registerUser("ck", "");
	Mockito.verify(loginDaoSpy,Mockito.times(1)).addUser("ak", "admin");
	Mockito.verify(loginDaoSpy,Mockito.times(0)).addUser("bk", "admin");
	Mockito.verify(loginDaoSpy,Mockito.never()).addUser("ck", "");
	
	}
	
	
}
