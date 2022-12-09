package com.webraa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebRaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebRaaApplication.class, args);
    }

}
