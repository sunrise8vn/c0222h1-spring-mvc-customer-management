//package com.cg.repository;
//
//import com.cg.model.Customer;
//import com.cg.model.CustomerDTO;
//
//import javax.persistence.*;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Transactional
//public class CustomerRepository implements ICustomerRepository {
//    @PersistenceContext
//    private EntityManager em;
//
//    @Override
//    public List<Customer> findAll() {
//
//        String str = "SELECT c.id, c.firstName, c.lastName FROM customers AS c;";
//        Query query = em.createNativeQuery(str, Customer.class);
//
////        TypedQuery<Customer> query = em.createQuery("select c.id from Customer c", Customer.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<CustomerDTO> findAllDTO() {
//        String str = "SELECT c.id, c.lastName FROM customers AS c;";
//        Query query = em.createNativeQuery(str, CustomerDTO.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public Customer findById(Long id) {
//        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
//        query.setParameter("id", id);
//        try {
//            return query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void save(Customer customer) {
//        if (customer.getId() != null) {
//            em.merge(customer);
//        } else {
//            em.persist(customer);
//        }
//    }
//
//    @Override
//    public void remove(Long id) {
//        Customer customer = findById(id);
//        if (customer != null) {
//            em.remove(customer);
//        }
//    }
//}
