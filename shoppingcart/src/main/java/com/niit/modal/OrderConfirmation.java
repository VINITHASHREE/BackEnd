package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "OrderConfirmation")
@Component 

public class OrderConfirmation {
	
	@Column
	private int userid ;
	@Column
	private int cartid;
	@Column
	private int billingid; 
	@Column
	private int shippingid;
	
	
}
