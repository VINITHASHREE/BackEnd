package com.niit.modal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "User")
@Component
public class User {
	@Id
	@Column
	@GeneratedValue
private int userid; 
	
	@Column
private String username;
	@Column
private String emailaddress;
	@Column
private String password;
    @Column
private int mobilenumber;
    @Column
private String address;

    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="userid")
     
    private Role role;
    
    public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
public int getUserId() {
 return userid;
}
public void setUserId(int userid) {
 this.userid = userid;
}
public String getUserName() {
 return username;
}
public void setUserName(String username) {
 this.username = username;
}
public String getEmailAddress() {
 return emailaddress;
}
public void setEmailAddress(String emailaddress) {
 this.emailaddress = emailaddress;
}
public String Password() {
	 return password;
}
public void setPassword(String password) {
 this.password = password;
}
public int getMobileNumber() {
	 return mobilenumber;
}
public void setMobileNumber(int mobilenumber) {
 this.mobilenumber = mobilenumber;
}
public String getAddress() {
 return address;
}
public void setAddress(String address) {
 this.address = address;
}

}