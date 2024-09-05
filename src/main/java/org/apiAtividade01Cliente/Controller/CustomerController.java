package org.apiAtividade01Cliente.Controller;

import org.apiAtividade01Cliente.Model.Customer;
import org.apiAtividade01Cliente.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    private final static String ENDPOINT = "customerManagement/api/customer";

    @PostMapping(ENDPOINT)
    public Customer save(@RequestBody Customer customer)
    {
        return this.customerService.save(customer);
    }

    @GetMapping(ENDPOINT)
    public List<Customer> all()
    {
        return customerService.all();
    }
}
