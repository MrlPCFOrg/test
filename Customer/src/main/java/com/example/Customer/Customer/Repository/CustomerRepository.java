package com.example.customer.Customer.Repository;

import com.example.customer.Customer.domain.CustomerDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository  extends MongoRepository <CustomerDomain,String> {

        public CustomerDomain findById(String id);
        public List<CustomerDomain> findByName(String name);
}
