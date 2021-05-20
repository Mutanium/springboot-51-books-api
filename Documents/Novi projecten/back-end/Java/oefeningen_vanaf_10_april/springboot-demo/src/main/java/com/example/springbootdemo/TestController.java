package com.example.springbootdemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/")
public class TestController {
    @RequestMapping(path="/test")
    public String helloWorld() {
        return "Hello World!";
    }
    @RequestMapping(path = "/books")
    public String getBooks() {
        return "boeken onder de request books";
    }
}

//in postman
// localhost:8080/test