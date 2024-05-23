package com.dxc.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			// begin the transaction
			ses.beginTransaction();
			
			//get the emp with id 5
			Employee emp= ses.get(Employee.class,1);
			
			//set the value
			emp.setEmpSal(6000);
			
			
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
		Employee emp3=session.get(Employee.class,3);//get emp3
		emp3.setEmpSal(70000);
		transaction.commit();
		

	}

}
