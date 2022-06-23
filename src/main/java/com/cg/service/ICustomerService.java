package com.cg.service;

import com.cg.model.Customer;
import com.cg.model.CustomerDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ICustomerService extends IGeneralService<Customer> {

    List<CustomerDTO> findAllDTO();

    List<Customer> findAllDeletedFalse();

    Iterable<Customer> findAllBy(Sort s);
}
