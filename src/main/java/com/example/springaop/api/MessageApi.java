package com.example.springaop.api;

import com.example.springaop.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageApi {
    @Autowired
    private MessageService messageService;


    //http://localhost:8080/message/param/product?apiVersion=1.0
    @PostMapping(value = "param/product",params = "apiVersion=1.0")
    public ResponseEntity<String> listAll(@RequestBody String message){
        return ResponseEntity.ok(messageService.message(message));
    }

    //http://localhost:8080/message/param/product?apiVersion=1.1
    @PostMapping(value = "param/product",params = "apiVersion=1.1")
    public ResponseEntity<String> listFindBy(@RequestBody String message){
        return ResponseEntity.ok(messageService.messageNewVersion(message));
    }
}
