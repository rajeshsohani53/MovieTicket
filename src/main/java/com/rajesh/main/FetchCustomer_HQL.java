package com.rajesh.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rajesh.Entity.Bookings;
import com.rajesh.Entity.Customer;

public class FetchCustomer_HQL {
   public static void main(String[] args) {
	Configuration con=new Configuration().configure();
	SessionFactory f=con.buildSessionFactory();
	Session s=f.openSession();
	String hql = "Select  b,c from Bookings b join b.customer c";
	Query<Object[]> query = s.createQuery(hql, Object[].class);

	List<Object[]> list = query.getResultList();

	for (Object[] row : list) {
		System.out.println(row[0]+" -->"+row[1]);
	}
	
	
}
}
