package com.dxc.HibernateCrud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class RetrieveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){

		// select *from emptab;
		List<Employee>	list=ses.createQuery("from Employee").getResultList();
		
		list.forEach(System.out::println);
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
       List<Employee>	list=session.createQuery("from Employee").getResultList();
		
		list.forEach(System.out::println);
		

	}

}
