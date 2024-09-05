package org.apiAtividade01Cliente.Repository;

import org.apiAtividade01Cliente.Model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<Customer>();
    public Customer save(Customer customer)
    {
        this.customers.add(customer);
        return customer;
    }

    public List<Customer> all()
    {
        return this.customers;
    }
}