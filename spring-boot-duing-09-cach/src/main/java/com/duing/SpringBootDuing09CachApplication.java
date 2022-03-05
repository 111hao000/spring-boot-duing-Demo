package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootDuing09CachApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDuing09CachApplication.class, args);
    }

}
