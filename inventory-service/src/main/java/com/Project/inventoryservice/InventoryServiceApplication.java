package com.Project.inventoryservice;

import com.Project.inventoryservice.model.Inventory;
import com.Project.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
	return args -> {
		Inventory inventory2 = new Inventory();
		inventory2.setSkuCode("Iphone-13");
		inventory2.setQuantity(100);

		Inventory inventory1 = new Inventory();
		inventory1.setSkuCode("Iphone-13-red");
		inventory1.setQuantity(0);

		inventoryRepository.save(inventory2);
		inventoryRepository.save(inventory1);
	};
	}
}
