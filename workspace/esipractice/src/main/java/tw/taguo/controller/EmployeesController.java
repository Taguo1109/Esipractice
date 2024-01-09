package tw.taguo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.taguo.model.Employees;
import tw.taguo.service.EmployeesService;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/search")
	public String searchEmployeesById(@RequestParam(value = "id", required = false) String id, Model model) {

		 List<Employees> employees;

		    try {
		        if (id != null && !id.isEmpty()) {
		            Integer empId = Integer.parseInt(id);

		            Employees employee = employeesService.getEmpById(empId);
		            employees = (employee != null) ? Collections.singletonList(employee) : Collections.emptyList();
		        } else {
		            employees = employeesService.getAllEmployees();
		        }

		        model.addAttribute("employees", employees);
		    } catch (NumberFormatException e) {
		        // 輸入的不是有效的整數，可以在這裡處理錯誤，例如設置一個錯誤消息
		        model.addAttribute("error", "Invalid employee ID format");
		    }

		    return "employeeList";
	}
}
