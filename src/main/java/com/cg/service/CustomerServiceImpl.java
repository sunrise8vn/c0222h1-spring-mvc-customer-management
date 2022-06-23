package com.cg.service;

import com.cg.model.Customer;
import com.cg.model.CustomerDTO;
import com.cg.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<CustomerDTO> findAllDTO() {
        return customerRepository.findAllDTO();
//        return null;
    }

    @Override
    public List<Customer> findAllDeletedFalse() {
        return customerRepository.findAllByIsDeletedFalse();
    }

    @Override
    public Iterable<Customer> findAllBy(Sort s) {
        return customerRepository.findAllBy(s);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}