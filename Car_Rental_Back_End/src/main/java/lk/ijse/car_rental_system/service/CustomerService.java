package lk.ijse.car_rental_system.service;

import lk.ijse.car_rental_system.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String nic);
    void updateCustomer(CustomerDTO customerDTO);
    CustomerDTO searchCustomer(String nic);
    List<CustomerDTO> getAllCustomer();
}
