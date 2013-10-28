package tw.ttucse.cloudhw.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 3248603398382720773L;
	private String account;
	private String password;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String account , String passwd){
		this.account = account;
		this.password =passwd;
	}
	
	public User(String account , String passwd ,String name ){
		this(account,passwd);
		this.name=name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
