package com.duing.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConfig {
    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event){
        System.out.println("ListenerConfig-->当前web容器的实现类是："+event.getWebServer().getClass().getName());
    }
}
