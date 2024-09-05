package org.apiAtividade01Cliente.Service;

import org.apiAtividade01Cliente.Model.Customer;
import org.apiAtividade01Cliente.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public List<Customer> all()
    {
        return customerRepository.all();
    }
}
