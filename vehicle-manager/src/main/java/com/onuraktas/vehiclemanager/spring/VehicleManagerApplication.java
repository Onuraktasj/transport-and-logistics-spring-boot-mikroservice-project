package com.onuraktas.vehiclemanager.spring;

import com.onuraktas.vehiclemanager.config.CommonConfig;
import com.onuraktas.vehiclemanager.config.TransactionManagementConfig;
import com.onuraktas.vehiclemanager.config.WebConfig;
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
public class VehicleManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleManagerApplication.class, args);
	}

}
