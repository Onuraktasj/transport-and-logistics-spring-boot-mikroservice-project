package com.onuraktas.truckloadmanager.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = "com.onuraktas.truckloadmanager")
@EnableJpaRepositories(value = "com.onuraktas.truckloadmanager.repository")
@EntityScan(value = "com.onuraktas.truckloadmanager.entity")
public class CommonConfig {
}
