package cnpm.group5.app.controller;

import lombok.RequiredArgsConstructor;
import cnpm.group5.app.entity.User;
import cnpm.group5.app.entity.dto.UserDto;
import cnpm.group5.app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "register";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute("userDto") UserDto userDto) {
        User user = userService.toUser(userDto);
        userService.addNewUser(user);
        return "redirect:/login";
    }
}
