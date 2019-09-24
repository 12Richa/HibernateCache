package com.nt.test;

import org.hibernate.Hibernate;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Employee;

public class FirstCache {
	private static SessionFactory factory;

	public static void main(String[] args) {
		Configuration cfg = null;
		Session ses = null;
		Employee emp1, emp2 = null;

		cfg = new Configuration();
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		// create Session factory object
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		// load the object
		emp1 = ses.get(Employee.class, 7788);
		System.out.println("Emp1 object" + emp1);

		emp2 = ses.get(Employee.class, 7788);
		System.out.println("Emp2 object" + emp2);

		// close objs
		ses.close();
		factory.close();

	}// main
}// class