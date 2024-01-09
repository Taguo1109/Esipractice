package tw.taguo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tw.taguo.model.Employees;

@Transactional
@Repository
public class EmployeesImpl implements EmployeesDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employees getById(int id) {
		return sessionFactory.getCurrentSession().get(Employees.class, id);
	}

	@Override
	public List<Employees> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("FROM Employees",Employees.class).getResultList();
	}

}
