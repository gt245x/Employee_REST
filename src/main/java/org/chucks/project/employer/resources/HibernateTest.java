package org.chucks.project.employer.resources;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.chucks.project.employer.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		
		Employee e = new Employee();
		e.setEmpName("Chelsea");
		e.setDesignation("Senator");
		session.save(e);
		
		//List<Employee> employees = new ArrayList<Employee>();
		
		//TypedQuery query = session.createQuery("FROM Employee");
		//employees = query.getResultList();
		
		//System.out.println(employees.size());
		session.getTransaction().commit();
		session.close();

	}

}
