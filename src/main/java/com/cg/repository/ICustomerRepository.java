package com.cg.repository;

import com.cg.model.Customer;
import com.cg.model.CustomerDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT NEW com.cg.model.CustomerDTO (c.id, c.firstName, c.lastName) FROM Customer c")
    List<CustomerDTO> findAllDTO();

    List<Customer> findAllByIsDeletedFalse();

    List<Customer> findAllByFirstNameLike(String firstName);

    Iterable<Customer> findAllBy(Sort s);
}
