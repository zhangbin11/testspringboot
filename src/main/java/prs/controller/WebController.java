package prs.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangbin on 2017/8/9.
 */
@Controller
public class WebController {

    @RequestMapping("/helloboot")
    public String hello(Model model){
        System.out.println("??");
        return "hello";
    }

}
