package com.dxc.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class BulkUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			// begin the transaction
			ses.beginTransaction();
		
			//update emptab set sal=sal+1000;
			
			ses.createQuery("UPDATE Employee SET empSal=empSal+1000.0").executeUpdate();
			
			//commit transaction
			ses.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
