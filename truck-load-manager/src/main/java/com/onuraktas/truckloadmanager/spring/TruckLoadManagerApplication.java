package com.onuraktas.truckloadmanager.spring;

import com.onuraktas.truckloadmanager.config.CommonConfig;
import com.onuraktas.truckloadmanager.config.TransactionManagementConfig;
import com.onuraktas.truckloadmanager.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(
		value = {
				CommonConfig.class,
				TransactionManagementConfig.class,
				WebConfig.class
		}
)
public class TruckLoadManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruckLoadManagerApplication.class, args);
	}

}
