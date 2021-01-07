package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Customer;
import com.demo.entities.Products;
import com.demo.repo.CustomerRepo;
import com.demo.repo.ProductsRepo;

@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private ProductsRepo productsRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Products p1 = new Products("laptop", 5000.00);
		Products p2 = new Products("keyboard", 500.00);
		Products p3 = new Products("mouse", 250.00);
		Products p4 = new Products("router", 2500.00);

		Customer c1 = new Customer("dilip", "9969", p1);
		Customer c2 = new Customer("balu", "799520", p1);

		Customer c3 = new Customer("Hari", "9182", p2);
		Customer c4 = new Customer("sadhik", "799523", p2);

		Customer c5 = new Customer("Ebinazer", "1234", p3);
		Customer c6 = new Customer("ganesh", "9440", p3);

		Customer c7 = new Customer("mallikarjun", "9889", p4);
		Customer c8 = new Customer("imran", "87876", p4);

		p1.getCustomers().add(c1);
		p1.getCustomers().add(c2);

		p2.getCustomers().add(c3);
		p2.getCustomers().add(c4);

		p3.getCustomers().add(c5);
		p3.getCustomers().add(c6);

		p4.getCustomers().add(c7);
		p4.getCustomers().add(c8);

		productsRepo.save(p1);
		productsRepo.save(p2);
		productsRepo.save(p3);
		productsRepo.save(p4);

		customerRepo.save(c1);
		customerRepo.save(c2);
		customerRepo.save(c3);
		customerRepo.save(c4);
		customerRepo.save(c5);
		customerRepo.save(c6);
		customerRepo.save(c7);
		customerRepo.save(c8);

	}

}
