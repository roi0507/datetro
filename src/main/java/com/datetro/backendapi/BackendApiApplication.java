package com.datetro.backendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EntityScan("com.datetro.models")
@EnableJpaRepositories("com.datetro.backendapi.dao")
@SpringBootApplication
public class BackendApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(BackendApiApplication.class, args);


    }

}
