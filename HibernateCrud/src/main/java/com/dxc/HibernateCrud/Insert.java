package com.dxc.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Insert {
	public static void main(String[] args)
	{	
	/*	SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			// begin the transaction
			ses.beginTransaction();
			
			//create emp object
			Employee emp1 = new Employee("Angela","QA",6000.0);
			Employee emp2 = new Employee("Broke","DEV",5000.0);
			Employee emp3 = new Employee("Smith","BA",7000.0);
			Employee emp4 = new Employee("Carl","DEV",5000.0);
			//save
			ses.save(emp1);
			ses.save(emp2);
			ses.save(emp3);
			ses.save(emp4);
			
			//commit transaction
			ses.getTransaction().commit();
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
		Transaction transaction=session.beginTransaction();
		Employee emp = new Employee("ABc","DEV",50000);
		session.save(emp);
		transaction.commit();
	}
}
