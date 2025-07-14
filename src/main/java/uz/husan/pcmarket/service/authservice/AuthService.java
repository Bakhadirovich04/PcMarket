package uz.husan.pcmarket.service.authservice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import uz.husan.pcmarket.playload.UserRequestDTO;

public interface AuthService {

    String signinPost( String username, String password);

    String signupPost(HttpServletRequest request, Model model, UserRequestDTO userRequestDTO);

}
