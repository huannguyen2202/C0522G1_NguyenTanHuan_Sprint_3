package sprint3_watch.service.decentralization.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprint3_watch.model.decentralization.Role;
import sprint3_watch.repository.decentralization.IRoleRepository;
import sprint3_watch.service.decentralization.IRoleService;


import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;


    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    public List<Role> getAllRoles() {
        return roleRepository.finAllRole();

    }

    @Override
    public void saveCreateGmail(String email) {
        roleRepository.insertRoleGmail(email);
    }

    @Override
    public List<Role> getRoleByUsername(String email) {
        return roleRepository.findRoleByUsername(email);
    }
}
