package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomersRepository {
    @PersistenceContext
    EntityManager entityManager;

    public CustomersRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<String> getProductsByCustomer(String name) {
        return entityManager.createQuery(
                "SELECT productName FROM Orders WHERE LOWER(customer.name) LIKE :name")
                .setParameter("name", name)
                .getResultList();
    }
}
