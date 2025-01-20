package com.parking.app.CustomerService.service;

import com.parking.app.CustomerService.entity.Booking;
import com.parking.app.CustomerService.entity.Customer;
import com.parking.app.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        Customer customerDB = getCustomer(customer.getId());
        if (null == customerDB){
            return null;
        }

        return customerRepository.save(customerDB);
    }

    @Override
    public void deleteCustomer(Long id) {

        Customer customerDB = getCustomer(id);
        if (null != customerDB){
            customerRepository.delete(customerDB);
        }
    }

    /*@Override
    public List<Customer> findByBooking(Booking booking) {
        return (List<Customer>) customerRepository.findByBooking(booking);
    }*/
}
