package com.ecommerce.library.service;

import com.ecommerce.library.dto.CustomerDTO;
import com.ecommerce.library.model.Customer;

public interface CustomerService {
    CustomerDTO save(CustomerDTO customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}
