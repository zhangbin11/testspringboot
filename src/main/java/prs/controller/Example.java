package prs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prs.model.UserEntity;
import prs.springsecurity.UserRepository;

import java.util.List;

/**
 * Created by zhangbin on 2017/8/9.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/test")
    public String test(){
//        return "hello Spring Boot";
        UserEntity u =  userRepository.findOne(1);
        List<UserEntity> list = userRepository.findAll();

        return u.getNickname();
    }

//    public static void main(String[] args) {
//        SpringApplication.run(Example.class,args);
//    }

}
