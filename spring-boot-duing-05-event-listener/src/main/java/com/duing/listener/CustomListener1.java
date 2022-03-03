package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import sun.security.krb5.Config;

public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener1类监听到了");
    }
}
