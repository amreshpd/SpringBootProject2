package com.nt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.dao.ILoginDao;
import com.nt.service.Loginmgmt;

public class LoginmgmtServiceTest {

	@InjectMocks
	private Loginmgmt loginService;
	@Mock
	private ILoginDao loginDaoMock;
//	@Spy
//	private ILoginDao loginDaoSpy;
	
	
	public LoginmgmtServiceTest() {
		MockitoAnnotations.openMocks(this);
	}
	
	
	//Test method
	
	@Test
	public void testLoginWithValidCredentials() {
		//provide stub [temporary functionalities] for DAO authentication method
//		Mockito.when(loginDaoMock.authentication("Amresh", "Amresh1988")).thenReturn(1);
		//  OR   (Alternate )
		BDDMockito.given(loginDaoMock.authentication("Amresh", "Amresh1988")).willReturn(1);
		
		//unit testing
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
