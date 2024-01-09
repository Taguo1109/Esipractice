package tw.taguo.dao;

import java.util.List;

import tw.taguo.model.Employees;

public interface EmployeesDao {
	
	Employees getById(int id);
	
	List<Employees> getAllEmployees();

}
