package com.onuraktas.usermanager.spring.spring;

import com.onuraktas.usermanager.spring.config.CommonConfig;
import com.onuraktas.usermanager.spring.config.TransactionManagementConfig;
import com.onuraktas.usermanager.spring.config.WebConfig;
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
public class UserManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagerApplication.class, args);
    }

}
