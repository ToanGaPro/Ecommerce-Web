package com.ecommerce.library.service;

import com.ecommerce.library.dto.AdminDTO;
import com.ecommerce.library.model.Admin;

public interface AdminService {
    Admin findByUserName(String username);

    Admin save(AdminDTO adminDTO);
}
