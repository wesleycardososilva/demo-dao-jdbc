package aplication;

import java.util.Date;
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
		Seller seller = sellerDao.findById(3);
		System.out.println("=====teste 1\n\n");
		System.out.println(seller);
		
		System.out.println("=====teste 2\n");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		/*System.out.println("=====teste 3\n");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("=====teste 4\n");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted id ="+ newSeller.getId());
		
		System.out.println("=====teste 5\n");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Updated");*/
		
		System.out.println("=====teste 6\n");
		System.out.println("entre com o id a ser deletado");
		int id= sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted");
		sc.close();
	}

}
