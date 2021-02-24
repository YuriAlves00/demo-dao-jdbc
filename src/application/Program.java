package application;

//import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();	

		System.out.println("===== Test 1: FindById ===== ");
		System.out.println("");
		Seller seller = sellerDao.findById(5);
		System.out.println(seller);
		System.out.println("");

		System.out.println("===== TEST 2: findByDepartment =====");
		System.out.println("");
		Department department = new Department(2, null);
		List<Seller> listDep = sellerDao.findByDepartment(department);
		for (Seller obj : listDep) {
			System.out.println(obj);
			System.out.println("");
		}
		System.out.println("");

		System.out.println("===== TEST 3: findAll =====");
		System.out.println("");
		List<Seller> list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			System.out.println("");
		}
		System.out.println("");
		
//		System.out.println("===== TEST 4: Insert =====");
//		System.out.println("");
//		Seller newSeller = new Seller(null, "John Wick", "johnwick@gmail.com", new Date(), 50000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted ! \nNew ID: " + newSeller.getId());
//		System.out.println("");
//		
		System.out.println("===== TEST 5: Update =====");
		System.out.println("");
		seller = sellerDao.findById(9);
		seller.setBaseSalary(500000.0);
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		System.out.println("");
		
		System.out.println("===== TEST 6: Delete =====");
		System.out.println("");
		System.out.println("Enter Id for Delete: ");
		int id = sc.nextInt();
		sellerDao.DeleteById(id);
		System.out.println("Delete Completed!");
		sc.close();
		
		System.out.println("");
		System.out.println("=========== END ============");

	}

}
