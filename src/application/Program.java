package application;

import java.util.Date;

import db.Seller;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
     
		Department department = new Department(1,"Games");
		
		Seller seller = new Seller(01, "CJ", "CJ@gmail.com", new Date(), 3000.0, department);
		
		System.out.println(seller);

	}

}
