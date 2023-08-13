package com.onuraktas.usermanager.spring;

import com.onuraktas.usermanager.config.CommonConfig;
import com.onuraktas.usermanager.config.WebConfig;
import com.onuraktas.usermanager.config.TransactionManagementConfig;
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
