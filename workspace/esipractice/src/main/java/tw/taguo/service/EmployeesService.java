package tw.taguo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.taguo.dao.EmployeesDao;
import tw.taguo.model.Employees;

@Service
@Transactional
public class EmployeesService {
	
	@Autowired
	private EmployeesDao employeesDao;
	
	public Employees getEmpById(int id) {
		return employeesDao.getById(id);
	}
	
	public List<Employees> getAllEmployees(){
		return employeesDao.getAllEmployees();
	}
}
