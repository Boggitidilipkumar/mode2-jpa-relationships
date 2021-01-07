package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Product;
import com.demo.entities.Review;
import com.demo.repo.ProductRepo;
import com.demo.repo.ReviewRepo;

@SpringBootApplication
public class JpaDemo3Application implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private ReviewRepo reviewRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Review r1 = new Review("*****(5)");
		Review r2 = new Review("****(4)");
		Review r3 = new Review("****(3)");

		Product p1 = new Product("MAC Book Pro", r1);
		Product p2 = new Product("HpLaptop", r1);

		Product p3 = new Product("Dell", r2);
		Product p4 = new Product("ASUS", r2);

		Product p5 = new Product("Lenovo", r3);
		Product p6 = new Product("i Ball", r3);

		r1.getProduct().add(p1);
		r1.getProduct().add(p2);

		r2.getProduct().add(p3);
		r2.getProduct().add(p4);

		r3.getProduct().add(p5);
		r3.getProduct().add(p6);

		reviewRepo.save(r1);
		reviewRepo.save(r2);
		reviewRepo.save(r3);

		productRepo.save(p1);
		productRepo.save(p2);
		productRepo.save(p3);
		productRepo.save(p4);
		productRepo.save(p5);
		productRepo.save(p6);

	}

}
