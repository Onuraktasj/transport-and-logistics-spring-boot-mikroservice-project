package com.onuraktas.vehiclemanager.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = "com.onuraktas.vehiclemanager")
@EnableJpaRepositories(value = "com.onuraktas.vehiclemanager.repository")
@EntityScan(value = "com.onuraktas.vehiclemanager.entity")
public class CommonConfig {
}
