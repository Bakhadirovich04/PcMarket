package uz.husan.pcmarket.controller.authcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerHome {
    @GetMapping
    public String home() {
        return "signup";
    }
}
