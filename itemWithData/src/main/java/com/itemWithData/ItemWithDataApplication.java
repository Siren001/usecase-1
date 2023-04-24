package com.itemWithData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//(scanBasePackages = "com.itemWithData.Item.ItemRepository")
//@EnableJpaRepositories
public class ItemWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemWithDataApplication.class, args);
	}

}
