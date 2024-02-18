package tw.taguo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tw.taguo.model.Employees;

@Transactional
@Repository
public class EmployeesImpl implements EmployeesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employees getById(int id) {
		return sessionFactory.getCurrentSession().get(Employees.class, id);
	}

	@Override
	public List<Employees> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("FROM Employees", Employees.class).getResultList();
	}

	@Override
	public List<Employees> getSubordinatesRecursive(int id) {
		List<Employees> result = new ArrayList<>();
		populateSubordinatesRecursive(id, result);
		return result;
	}

	private void populateSubordinatesRecursive(int id, List<Employees> result) {
		Employees employee = getById(id);
		if (employee != null) {
			result.add(employee);

			List<Employees> subordinates = getDirectSubordinates(id);
			
			//自己調用自己的方法，遞迴
//			for (Employees subordinate : subordinates) {
//				populateSubordinatesRecursive(subordinate.getId(), result);
//			}
			for (int i = 0; i < subordinates.size(); i++) {
			    Employees subordinate = subordinates.get(i);
			    populateSubordinatesRecursive(subordinate.getId(), result);
			}
		}
	}

	private List<Employees> getDirectSubordinates(int id) {
		return sessionFactory.getCurrentSession().createQuery("FROM Employees WHERE ReportsTo = :id", Employees.class)
				.setParameter("id", id).getResultList();
	}

}
