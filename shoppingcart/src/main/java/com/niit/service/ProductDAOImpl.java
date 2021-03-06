package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Product;

@Repository("ProductDAO")

public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> getAllProduct() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }


	@Transactional
	public Product getProduct(int productid) {
		return (Product)sessionFactory.getCurrentSession().get(Product.class, productid);
	}

	@Transactional
	public void insertProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}	
	
	@Transactional
	public void deleteProduct(int id) {
		Product deleteProduct=new Product();
		deleteProduct.setId(id);
		sessionFactory.getCurrentSession().delete(deleteProduct);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

	}

	
	public void deleteAllProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
