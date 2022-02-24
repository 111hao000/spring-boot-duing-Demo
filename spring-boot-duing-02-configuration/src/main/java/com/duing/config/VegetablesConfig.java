package com.duing.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource(value ="classpath:vegetables.properties",encoding="UTF-8")
@Getter@Setter
public class VegetablesConfig {
    private String potato;
    private String dreenpeper;
    private String eggplant;
}
