package myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/")
    public String Start(){
        return "/admin";
    }

    @GetMapping("/admin")
    public String Admin(){
        return "/admin";
    }
}
