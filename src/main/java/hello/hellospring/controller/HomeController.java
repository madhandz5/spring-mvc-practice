package hello.hellospring.controller;/*
 * @created 09/09/2020 - 6:07 오후
 * @project hello-spring
 * @author ryan
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
