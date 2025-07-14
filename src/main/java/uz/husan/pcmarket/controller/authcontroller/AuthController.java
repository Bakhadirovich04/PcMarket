package uz.husan.pcmarket.controller.authcontroller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.husan.pcmarket.playload.UserRequestDTO;

@Controller
@RequestMapping("/auth")
public interface AuthController {
    @PostMapping("/signin")
    String signinPost(@RequestParam String username, @RequestParam String password);
    @GetMapping("/signin")
    String signinGet(Model model);

    @PostMapping("/signup")
    String signupPost(HttpServletRequest request,Model model, @RequestBody UserRequestDTO userRequestDTO);
    @GetMapping("/signup")
    String signupGet(Model model);
}
