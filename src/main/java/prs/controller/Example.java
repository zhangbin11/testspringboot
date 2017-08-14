package prs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangbin on 2017/8/9.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String test(){
        return "hello Spring Boot";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(Example.class,args);
//    }

}
