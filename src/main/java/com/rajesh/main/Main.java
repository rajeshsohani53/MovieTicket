package com.rajesh.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Configuration configuration=new Configuration();
   configuration.configure();
   SessionFactory sessionFactory= configuration.buildSessionFactory();
	
	}

}
