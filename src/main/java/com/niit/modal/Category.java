package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Category")
@Component


public class Category {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryid;
	@Column
	private String categoryname;  
	@Column
	private String categorydesc; 

public int getCategoryId() {
	 return categoryid;
	}
	public void setCategoryId(int categoryid) {
		this.categoryid = categoryid;
	}
public String getCategoryName() {
 return categoryname;
}
public void setCategoryName(String categoryname) {
	this.categoryname = categoryname;
}
public String getCategoryDesc() {
	 return categorydesc ;
	}
	public void setCategoryDesc(String categorydesc) {
		this.categorydesc = categorydesc;
	}
}
