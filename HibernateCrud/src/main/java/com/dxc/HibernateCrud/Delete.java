package com.dxc.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			// begin the transaction
			ses.beginTransaction();
			
			//get emp
			Employee emp3 = ses.get(Employee.class,3);
			Employee emp2 = ses.get(Employee.class,2);
			
		
			//delete
			ses.delete(emp3);
			ses.delete(emp2);
			
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
		session.delete(emp3);//delete emp3
		transaction.commit();
		
	}

}
