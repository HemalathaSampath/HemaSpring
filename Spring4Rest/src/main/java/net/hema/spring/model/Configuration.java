package net.hema.spring.model;

public class Configuration {
	
	private String URL;
	private String UserName;
	private String Password;
	private String DBDriverName;
	
	public Configuration(String uRL, String userName, String password, String dBDriverName) {
		super();
		URL = uRL;
		UserName = userName;
		Password = password;
		DBDriverName = dBDriverName;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDBDriverName() {
		return DBDriverName;
	}
	public void setDBDriverName(String dBDriverName) {
		DBDriverName = dBDriverName;
	}

}
