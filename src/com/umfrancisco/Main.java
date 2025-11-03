package com.umfrancisco;

import java.util.ArrayList;
import java.util.List;

import com.umfrancisco.domain.Employee;
import com.umfrancisco.domain.EmployeeComparator;

public class Main {
	public static void main(String[] args) {
		Employee[] list = {
				new Employee(101, "Ralph", 2015), 
				new Employee(105, "Carole", 2021), 
				new Employee(102, "Jane", 2013),
				new Employee(130, "Laura", 2020),
				new Employee(100, "Jim", 2018)};
		
		List<Employee> employees = new ArrayList<>(List.of(list));
		
//		var comparator = new EmployeeComparator<>();
//		employees.sort(comparator);
		
		employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
		
		for (var e : employees) {
			System.out.println(e);
		}
	}
}
