package uz.husan.pcmarket.controller.authcontroller.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import uz.husan.pcmarket.controller.authcontroller.AuthController;
import uz.husan.pcmarket.playload.UserRequestDTO;
@Controller
@Component
@RequiredArgsConstructor
public class AuthControllerImpl implements AuthController {

    @Override
    public String signinPost(String username, String password) {

        return "";
    }

    @Override
    public String signinGet(Model model) {
        return "signin";
    }

    @Override
    public String signupPost(HttpServletRequest request, Model model, UserRequestDTO userRequestDTO) {
        return "";
    }

    @Override
    public String signupGet(Model model) {
        return "signup";
    }
}
