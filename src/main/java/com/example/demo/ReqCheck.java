package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//Прокси, чтобы вставить реквест бин в синглтон
@Scope("request")
public class ReqCheck {
    public ReqCheck() {
        System.out.println("Check");
    }
}
