package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 方式二：通过@Component声明这是一个需要加载的监听器
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CuotmListener2监听到了");
    }
}
