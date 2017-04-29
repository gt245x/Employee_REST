package org.chucks.project.employer.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.chucks.project.employer.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public EmployeeDAO() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		int size = 0;
		
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			TypedQuery<Employee> query = session.createQuery("from Message");
						
			employees = query.getResultList();
			size = employees.size();
			session.getTransaction().commit();
		}catch (Exception e) {
			
		}finally{
			session.close();
		}
		return employees;
	}
	
	public Employee saveEmployee(Employee emp) {
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return emp;
	}
	
	public List<Employee> testAll() {
		SessionFactory sessionFactory1 = new Configuration().configure().buildSessionFactory();
		Session session1 = sessionFactory1.openSession();		
		session.beginTransaction();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		TypedQuery query = session.createQuery("from Employee");
		employees = query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return employees;
	}

}
