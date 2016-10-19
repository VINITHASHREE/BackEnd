package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Supplier")
@Component
public class Supplier {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int supplierid; 
	@Column
	private String suppliername;
	@Column
	private String emailaddress;
	@Column
	private String address;
	@Column
	private int mobilenumber;
	


	public int getSupplierId() {
	 return supplierid;
	}
	public void setSupplierId(int supplierid) {
	 this.supplierid = supplierid;
	}
	public String getSupplierName() {
	 return suppliername;
	}
	public void setSupplierName(String suppliername) {
	 this.suppliername = suppliername;
	}
	public String getEmailAddress() {
	 return emailaddress;
	}
	public void setEmailAddress(String emailaddress) {
	 this.emailaddress = emailaddress;
	}
	public String getAddress() {
		 return address;
		}
		public void setAddress(String address) {
		 this.address = address;
		}
	
	public int getMobileNumber() {
		 return mobilenumber;
	}
	public void setMobileNumber(int mobilenumber) {
	 this.mobilenumber = mobilenumber;
	}
	


}
