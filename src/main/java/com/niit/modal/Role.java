package com.niit.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Role")
@Component
public class Role {
	
	@Id
	@Column
	@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator",strategy="foreign",parameters={@Parameter(value="user",name="property")})
	
private int userid;;
	@Column
private int roleid;
	@Column
private String role;
	@Column
private String username;
	@Column
private String password;
	@Column
private String enabled;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="userid")
private User user;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getUserId() {
 return userid;
}
public void setUserId(int userid) {
    this.userid = userid;
}
public int getRoleId() {
	 return roleid;
	}
	public void setRoleId(int roleid) {
		this.roleid = roleid;
	}
public String getRole() {
	 return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getUserName() {
	 return username;
}
public void setUserName(String username) {
this.username = username;
}
public String getPassword() {
 return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEnabled() {
	 return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}
