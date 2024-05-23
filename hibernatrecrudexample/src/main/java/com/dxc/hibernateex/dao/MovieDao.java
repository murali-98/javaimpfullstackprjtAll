package com.dxc.hibernateex.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dxc.hibernateex.entity.Movie;

public class MovieDao  {
	
	
	
	public static void main() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Movie movie = new Movie("India",200.0,"3hrs","5.5");
		session.save(movie);
		transaction.commit();
		
		
	}
}
