package cnpm.group5.app.service;

import cnpm.group5.app.entity.Role;

import java.util.List;

public interface RoleService {
    Role findByRoleName(String roleName);

    Role save(Role role);

    void saveAll(List<Role> roles);
}
