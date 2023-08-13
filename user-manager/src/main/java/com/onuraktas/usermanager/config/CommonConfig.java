package com.onuraktas.usermanager.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = "com.onuraktas.usermanager")
@EnableJpaRepositories(value = "com.onuraktas.usermanager.repository")
@EntityScan(value = "com.onuraktas.usermanager.entity")
public class CommonConfig {
}
