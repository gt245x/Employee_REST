package org.chucks.project.employer.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.chucks.project.employer.dao.EmployeeDAO;
import org.chucks.project.employer.model.Employee;

@Path("/employees")
public class EmployeeResource {
	
	EmployeeDAO empDao = new EmployeeDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
        return empDao.getAllEmployees();
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee emp){
	return empDao.saveEmployee(emp);
	}

}
