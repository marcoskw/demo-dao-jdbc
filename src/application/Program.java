package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ====");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);		
		
		System.out.println();
		
		System.out.println("=== Test 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println();
		
		System.out.println("=== Test 3: Seller findAll ===");
		list = sellerDao.findAll();
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println();
		
		System.out.println("=== Test 4: Seller insert ===");		
		Seller newSeller = new Seller(null, "Greg Red", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("=== Test 5: Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
	
		
		System.out.println();
		
		System.out.println("=== Test 5: Seller delete ===");
		System.out.print("Enter id for delete test: ");
		int deleteId = scanner.nextInt();
		sellerDao.deleteById(deleteId);
		System.out.println("Delete Completed!");
		
		
		
		scanner.close();
	}

}
