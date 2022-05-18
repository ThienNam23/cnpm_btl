package cnpm.group5.app.controller;

import cnpm.group5.app.entity.User;
import cnpm.group5.app.entity.dto.UserDto;
import cnpm.group5.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/test")
    @ResponseBody
    public String showLoginPage() {
        return "Admin test oke!";
    }
}
