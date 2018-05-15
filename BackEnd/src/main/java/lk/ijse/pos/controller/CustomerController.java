package lk.ijse.pos.controller;

import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author lakitha
 */

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping (value = "/save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.save(customerDTO);
    }

    @GetMapping(value = "all")
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }

    @PutMapping(value = "update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.update(customerDTO);
    }

    @GetMapping(value = "search")
    public CustomerDTO findCustomerById(@RequestParam int id){
        return customerService.findByID(id);
    }

    @DeleteMapping(value = "delete")
    public boolean deleteCustomer(@RequestParam int id){
        return customerService.delete(id);
    }
}
