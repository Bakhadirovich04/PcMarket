package uz.husan.pcmarket.service.authservice.impl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import uz.husan.pcmarket.playload.UserRequestDTO;
import uz.husan.pcmarket.service.authservice.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public String signinPost(String username, String password) {
        return "";
    }


    @Override
    public String signupPost(HttpServletRequest request, Model model, UserRequestDTO userRequestDTO) {
        if (userRequestDTO.getUsername() == null || userRequestDTO.getUsername().isEmpty()) {
            model.addAttribute("message", "Username is required");
            return "autherror";
        }


        HttpSession session = request.getSession();
        session.setAttribute("currentUser", userRequestDTO);
        return "";
    }

}
