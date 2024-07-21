package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private String uName, pWord, fName, lName, address, mailId;
	private Long phoneNo;

	public AdminBean() {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
/*
 * ----------------------------------------- --------
 * ---------------------------- UNAME NOT NULL VARCHAR2(35) PWORD VARCHAR2(35)
 * FNAME VARCHAR2(40) LNAME VARCHAR2(30) ADDRESS VARCHAR2(100) MAILID
 * VARCHAR2(45) PHONENO NUMBER(15)
 */