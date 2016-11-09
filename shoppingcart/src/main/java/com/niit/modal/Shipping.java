package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "Shipping")
@Component
public class Shipping {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int shippingid;
	@Column
	private int userid ;
	@Column
	private int id ; 
	@Column
	private int price ; 
	@Column
	private String address;
   
	
	public int getShippingId() {
		 return shippingid;
		}
		public void setShippingId(int shippingid) {
			this.shippingid = shippingid;
		}
		
		
		
		public int getUserId() {
		 return userid;
		}
		public void setUserId(int userid) {
		    this.userid = userid;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPrice() {
			 return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getAddress() {
				 return address;
				}
				public void setAddress(String address) {
				 this.address = address;
				}

}
