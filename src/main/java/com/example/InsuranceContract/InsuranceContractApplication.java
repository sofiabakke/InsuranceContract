package com.example.InsuranceContract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.ws.rs.*;

@SpringBootApplication
@ApplicationPath("/api")
public class InsuranceContractApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceContractApplication.class, args);
    }
}
