package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.modal.Card;
import com.niit.modal.Cart;
import com.niit.modal.Category;
import com.niit.modal.Product;
import com.niit.modal.Role;
import com.niit.modal.Shipping;
import com.niit.modal.Supplier;
import com.niit.modal.User;
import com.niit.service.CardDAO;
import com.niit.service.CartDAO;
import com.niit.service.CategoryDAO;
import com.niit.service.ProductDAO;
import com.niit.service.RoleDAO;
import com.niit.service.ShippingDAO;
import com.niit.service.SupplierDAO;
import com.niit.service.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("system.....");
		
	    UserDAO userDAO=(UserDAO) context.getBean("UserDAO");
		User user=(User) context.getBean("user");
		
		
		user.setUserName("vinitha");
		user.setEmailAddress("vinithashreeprabhakaran@gmail.com");
		user.setPassword("shree");
		user.setMobileNumber(9585);
		user.setAddress("Thennampalayam");
 
		userDAO.insertUser(user);

		
		 ProductDAO productDAO=(ProductDAO) context.getBean("ProductDAO");
		 Product product=(Product) context.getBean("product");
			
		 
		 product.setProductName("kurtis") ; 
		 product.setDescription("cotton,synthetic kurtis");
		 product.setQuantity(10);
		 product.setPrice(700); 
		 product.setCategoryId(1);
		 product.setSupplierId(1);
		 product.setSize(38); 	
		 
		 productDAO.insertProduct(product);

	
	
		 CategoryDAO categoryDAO=(CategoryDAO) context.getBean("CategoryDAO");
		 Category category=(Category) context.getBean("category");
		 
		 category.setCategoryName("clothing");
		 category.setCategoryDesc("all types of clothes");
		 
		 categoryDAO.insertCategory(category);
		 
	
	
		 SupplierDAO supplierDAO=(SupplierDAO) context.getBean("SupplierDAO");
		 Supplier supplier=(Supplier) context.getBean("supplier");
		 
		 
		 supplier.setSupplierName("Supriga");
		 supplier.setEmailAddress("suprigavivek03@gmail.com");
		 supplier.setAddress("Peelamedu");
		 supplier.setMobileNumber(956642);
		 
		 supplierDAO.insertSupplier(supplier);
		 
		 
		 CartDAO cartDAO=(CartDAO) context.getBean("CartDAO");
		 Cart cart=(Cart) context.getBean("cart");

		 cart.setUserId(1);
		 cart.setProductId(1);
		 cart.setQuantity(1);
		 cart.setPrice(300) ; 
			
		 cartDAO.insertCart(cart);
		 
		
		 ShippingDAO shippingDAO=(ShippingDAO) context.getBean("ShippingDAO");
		 Shipping shipping=(Shipping) context.getBean("shipping");
		 
		 
		  shipping.setUserId(1) ;
		  shipping.setProductId(1) ; 
		  shipping.setPrice(300) ; 
		  shipping.setAddress("peelamedu");
		  
		
		  shippingDAO.insertShipping(shipping);
		  
		  
		  
		 
		RoleDAO roleDAO=(RoleDAO) context.getBean("RoleDAO");
		  Role role=(Role) context.getBean("role");
		  
		  
		  role.setUserId(1);
		  role.setRole("user");
		  role.setUserName("vinitha");
		  role.setPassword("shree") ; 
		  role.setEnabled("true");
		  
		
		  
		  
		  
//		  roleDAO.insertRole(role);
			
		  
		  CardDAO cardDAO=(CardDAO) context.getBean("CardDAO");
		  Card card=(Card) context.getBean("card");
		  
		  
		  card.setCardHolderName("vinithashree");
		  card.setCardNumber(1);
		  card.setcvvnumber(1);
		  card.setCardType("credit") ; 
		  
		  
		  cardDAO.insertCard(card);
		  
		  
		  
		  
		 
		  
		  
		
		 
		 
		 
		
}
}
