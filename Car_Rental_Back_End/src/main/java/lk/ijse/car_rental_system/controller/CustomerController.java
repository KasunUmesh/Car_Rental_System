package lk.ijse.car_rental_system.controller;

import lk.ijse.car_rental_system.dto.CustomerDTO;
import lk.ijse.car_rental_system.entity.Customer;
import lk.ijse.car_rental_system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO customer){
        customerService.saveCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO customer) {

        customerService.updateCustomer(customer);
    }

    @DeleteMapping(params = {"nic"})
    public void deleteCustomer(@RequestParam String nic) {

        customerService.deleteCustomer(nic);
    }

    @GetMapping(path = "/{nic}")
    public CustomerDTO searchCustomer(@PathVariable String nic) {

        return customerService.searchCustomer(nic);
    }

}
