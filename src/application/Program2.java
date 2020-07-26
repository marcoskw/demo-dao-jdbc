package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;


public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
	/*	System.out.println("\n=== TEST 1: department insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId()); */
		
		System.out.println();
		
		System.out.println("=== Test 2: department findById ====");
		Department department= departmentDao.findById(2);				
		System.out.println(department);		
		
		System.out.println();
		
		System.out.println("=== Test 3: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department department2 : list) {
			System.out.println(department2);
		}
				
		scanner.close();
	}

}
