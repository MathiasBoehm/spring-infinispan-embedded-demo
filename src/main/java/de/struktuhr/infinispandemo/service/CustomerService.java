package de.struktuhr.infinispandemo.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import de.struktuhr.infinispandemo.entity.Customer;

@Service
public class CustomerService {

    private final static Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Cacheable("customers")
    public Customer getCustomer(String id) {
      final Customer customer = new Customer(id, "John Doe", new Date());
      log.info("Create a Customer {}", customer);
      return customer;
    }
}
