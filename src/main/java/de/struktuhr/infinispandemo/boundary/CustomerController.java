package de.struktuhr.infinispandemo.boundary;

import de.struktuhr.infinispandemo.entity.Customer;
import de.struktuhr.infinispandemo.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return customerService.getCustomer(id);
    }
}
