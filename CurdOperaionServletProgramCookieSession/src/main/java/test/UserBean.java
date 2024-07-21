package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable {
	private String uName,pWord,fName,lName,mId,address;
	private Long phoneNo;
	public UserBean() {
		super();
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
/*
 UNAME                                              VARCHAR2(25)
 PWORD                                              VARCHAR2(25)
 FNAME                                              VARCHAR2(25)
 LNAME                                              VARCHAR2(25)
 MID                                                VARCHAR2(30)
 ADDRESS                                            VARCHAR2(50)
 PHNO                                               NUMBER(15)
*/