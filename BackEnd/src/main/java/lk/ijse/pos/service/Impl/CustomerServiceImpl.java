package lk.ijse.pos.service.Impl;

import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.repository.CustomerRepository;
import lk.ijse.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lakitha
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean save(CustomerDTO cus) {
        System.out.println("In CustomerService");
        return customerRepository.save(new Customer(cus.getId(), cus.getName(), cus.getAddress(), cus.getContacts()));
    }

    @Override
    public CustomerDTO findByID(int id) {
        Customer customer=null;
        if(customerRepository.findByID(id)!=null){
            customer = customerRepository.findByID(id);
            return new CustomerDTO(customer.getId(),customer.getName(), customer.getAddress(), customer.getContacts());
        }
        return null;
    }

    @Override
    public boolean update(CustomerDTO customerDTO) {
        return customerRepository.update(new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getContacts()));
    }

    @Override
    public boolean delete(int id) {
        CustomerDTO cus=findByID(id);
        if(cus!=null){
            customerRepository.delete(new Customer(cus.getId(), cus.getName(), cus.getAddress(), cus.getContacts()));
            return true;
        }
        return false;
    }

    @Override
    public List<CustomerDTO> getAll() {

        List<CustomerDTO> allCustomers = new ArrayList<>();
        if(customerRepository.getAll()!= null){
            for (Customer customer  : customerRepository.getAll()) {
                CustomerDTO customerDTO = new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getContacts());
                allCustomers.add(customerDTO);
            };
            return allCustomers;
        }

        return null;
    }
}
