package com.example.springaop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public  String message(String param)
    {
        System.out.println("Method give message"+param);
        return param;
    }
}
