package com.example.embeddedpaymentform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmbeddedPaymentFormApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmbeddedPaymentFormApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EmbeddedPaymentFormApplication.class, args);
    }
}
