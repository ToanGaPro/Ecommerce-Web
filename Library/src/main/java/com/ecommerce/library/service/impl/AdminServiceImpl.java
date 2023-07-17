package com.ecommerce.library.service.impl;

import com.ecommerce.library.dto.AdminDTO;
import com.ecommerce.library.model.Admin;
import com.ecommerce.library.model.Role;
import com.ecommerce.library.repository.AdminRepository;
import com.ecommerce.library.repository.RoleReposity;
import com.ecommerce.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleReposity roleReposity;

    @Override
    public Admin findByUserName(String username) {
        return adminRepository.findByUserName(username);
    }

    @Override
    public Admin save(AdminDTO adminDTO) {
        Admin admin = new Admin();
        admin.setFirstName(adminDTO.getFirstName());
        admin.setLastName(adminDTO.getLastName());
        admin.setUserName(adminDTO.getUserName());
        admin.setPassword((adminDTO.getPassword()));
        admin.setRoles(Arrays.asList(roleReposity.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
