package com.duing.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;


@ConfigurationProperties(prefix = "food")
@PropertySource(value ="classpath:application.properties",encoding="UTF-8")
@Getter@Setter
public class FoodConfig {
    private String meat;
    private String rice;
}
