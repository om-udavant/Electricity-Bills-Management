package com.infotech.ElectricityBills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration()
public class ElectricityBillsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillsManagementApplication.class, args);
	}

}
