package com.hokumus.jsfsample.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.hokumus.jsfsample.models.users.Users;
import com.hokumus.jsfsample.utils.dao.DbServicessBase;

@ManagedBean(name = "loginmbean")
@SessionScoped
public class LoginBean {

	
	public LoginBean() {
		System.out.println("oluþtu");
	}
	private String email ="sdfldsfksdlþfk";
	private String password;
	
	public void giris() {
		System.out.println(this.email+ " "+ this.password);
		DbServicessBase<Users> dao = new DbServicessBase<Users>();
		dao.getAllRows(new Users());
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
