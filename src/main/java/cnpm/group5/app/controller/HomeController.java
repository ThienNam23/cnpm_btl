package cnpm.group5.app.controller;

import cnpm.group5.app.entity.User;
import cnpm.group5.app.service.UserService;
import lombok.RequiredArgsConstructor;
import cnpm.group5.app.entity.Role;
import cnpm.group5.app.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {
    private final RoleService roleService;
    private final UserService userService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/init")
    public String initSecurity() {
        // create ROLE_ADMIN vs ROLE_USER
        Role userRole = new Role();
        userRole.setRoleName("USER");
        Role adminRole = new Role();
        adminRole.setRoleName("ADMIN");
        roleService.saveAll(Arrays.asList(userRole, adminRole));

        // create Admin's account
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("admin_gr5");
        admin.setRoles(new LinkedHashSet<>(Collections.singletonList(
                roleService.findByRoleName("ADMIN")
        )));
        admin.setFirstName("Admin");
        admin.setLastName("GR5");
        userService.addNewUser(admin);
        return "init";
    }
}
