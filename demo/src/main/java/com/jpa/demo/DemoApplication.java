package com.jpa.demo;

import com.jpa.demo.entities.Product;
import com.jpa.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product(null,"Lenovo T420",500,3));
		productRepo.save(new Product(null,"Samsung ML-410",149,2));
		productRepo.save(new Product(null,"Redmi Note 13",249,7));
	}
}
