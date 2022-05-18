package cnpm.group5.app.service.bean;

import lombok.AllArgsConstructor;
import cnpm.group5.app.entity.Role;
import cnpm.group5.app.repository.RoleRepo;
import cnpm.group5.app.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceBean implements RoleService {

    private final RoleRepo roleRepo;

    @Override
    public Role findByRoleName(String roleName) {
        return roleRepo.findByRoleName(roleName).orElse(null);
    }

    @Override
    public Role save(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void saveAll(List<Role> roles) {
        roleRepo.saveAll(roles);
    }
}
