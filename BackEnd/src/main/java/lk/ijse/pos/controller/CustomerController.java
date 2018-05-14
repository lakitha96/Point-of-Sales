package lk.ijse.pos.controller;

import lk.ijse.pos.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lakitha
 */

@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @PostMapping(value = "save")
    public boolean saveCustomer(CustomerDTO customerDTO){
        return false;
    }
}
