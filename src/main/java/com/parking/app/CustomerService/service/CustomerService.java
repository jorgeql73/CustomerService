package com.parking.app.CustomerService.service;

import com.parking.app.CustomerService.entity.Booking;
import com.parking.app.CustomerService.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> listAllCustomer();
    public Customer getCustomer(Long id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public  void deleteCustomer(Long id);
    public List<Customer> findByBooking(Booking booking);
}
