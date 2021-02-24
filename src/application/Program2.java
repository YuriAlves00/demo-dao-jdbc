package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("===== Test 1: FindById ===== ");
		System.out.println("");
		Department department = departmentDao.findById(5);
		System.out.println(department);
		System.out.println("");

		System.out.println("===== TEST 2: findAll =====");
		System.out.println("");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("===== TEST 3: Insert =====");
		System.out.println("");
		Department newDepartment = new Department(null, "Guns");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted ! \nNew ID: " + newDepartment.getId());
		System.out.println("");

		System.out.println("===== TEST 4: Update =====");
		System.out.println("");
		department = departmentDao.findById(3);
		department.setName("Clothes");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		System.out.println("");
		
		System.out.println("===== TEST 5: Delete =====");
		System.out.println("");
		System.out.println("Enter Id for Delete: ");
		int id = sc.nextInt();
		departmentDao.DeleteById(id);
		System.out.println("Delete Completed!");
		sc.close();

	}

}
