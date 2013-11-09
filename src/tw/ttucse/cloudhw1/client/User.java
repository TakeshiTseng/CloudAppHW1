package tw.ttucse.cloudhw1.client;

import java.io.Serializable;

import javax.jdo.annotations.*;

@PersistenceCapable
public class User implements Serializable{
	@PrimaryKey 
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String account;

	@Persistent
	private String username="";

	@Persistent
	private String password;

	public User(String account, String password) {
		this.account = account;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
