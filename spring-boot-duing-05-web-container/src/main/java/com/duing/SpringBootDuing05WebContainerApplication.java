package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class SpringBootDuing05WebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDuing05WebContainerApplication.class, args);
    }
    @Bean
    public RouterFunction<ServerResponse> hello(){
        return route(GET("/hello"),serverRequest -> ok().body(Mono.just("hello world"),String.class));
    }

}
