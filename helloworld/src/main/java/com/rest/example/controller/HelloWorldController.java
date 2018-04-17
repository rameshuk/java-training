package com.rest.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ramesh on 14/04/2018.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping("/")
    public ResponseEntity<String> sayHelloWorld() {
        String str = "Hello World";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }

//add?x=10&y=20
    @RequestMapping("/add")
    public ResponseEntity<String> add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return new ResponseEntity<String>("" + (x+y) , HttpStatus.OK);
    }
}
