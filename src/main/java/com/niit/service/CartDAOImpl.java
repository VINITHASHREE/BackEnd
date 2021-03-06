package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modal.Cart;

@Repository("CartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSession()
	{
		return sessionFactory;
		
	}
	public CartDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Cart> getAllCart() {
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

	@Transactional
	public Cart getCart(int cartid) {
		return (Cart)sessionFactory.getCurrentSession().get(Cart.class, cartid);
	}

	@Transactional
	public void insertCart(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	
	}
	
	public void deleteCart(int id) {
		Cart deleteCart=new Cart();
		deleteCart.setCartId(id);
		sessionFactory.getCurrentSession().delete(deleteCart);

	}

	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub

	}

	

	@Transactional
	public void deleteAllCart(Cart cart) {
		// TODO Auto-generated method stub

	}

}
