package ru.kata.spring.boot_security.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepo;

    @Autowired
    public void setRoleRepo(RoleRepository roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepo.getRoleByName(name);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepo.getRoleById(id);
    }

    @Override
    public List<Role> allRoles() {
        return roleRepo.allRoles();
    }

    @Override
    public Role getDefaultRole() {
        return roleRepo.getDefaultRole();
    }
}
