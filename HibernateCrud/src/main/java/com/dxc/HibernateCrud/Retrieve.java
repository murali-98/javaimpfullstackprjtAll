package com.dxc.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			
			Employee emp=ses.get(Employee.class,1);
			
			System.out.println("emp with id 1 info "+ emp);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	*/
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee emp=session.get(Employee.class,9);
		
		System.out.println("emp with id 9 info "+ emp);
		
		


	}

}
