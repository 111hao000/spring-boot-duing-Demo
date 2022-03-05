package com.duing.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom")
public class CustomPoint {
    @ReadOperation
    @ResponseBody
    public Map<String,String> custom(){
        Map<String,String> result = new HashMap<>();
        result.put("name","hello custom endpoint");
        return result;
    }
}
