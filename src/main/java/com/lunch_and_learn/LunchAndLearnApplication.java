package com.lunch_and_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LunchAndLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunchAndLearnApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
