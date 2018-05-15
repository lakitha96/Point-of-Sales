package lk.ijse.pos.service.Impl;

import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.repository.CustomerRepository;
import lk.ijse.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author lakitha
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean save(CustomerDTO cus) {
        Customer save = customerRepository.save(new Customer(cus.getName(), cus.getAddress(), cus.getContacts()));
        if (save != null){
            return true;
        }
        return false;
    }

    @Override
    public CustomerDTO findByID(int id) {
        Optional<Customer> byId = customerRepository.findById(id);
        if(byId.isPresent()){
            return new CustomerDTO(byId.get().getId(), byId.get().getName(), byId.get().getAddress(), byId.get().getContacts());
        }
        return null;
    }

    @Override
    public boolean update(CustomerDTO customerDTO) {
        if((findByID(customerDTO.getId()))!=null){
            Customer save = customerRepository.save(new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getContacts()));
            if (save != null) {
                return true;
            }
        }
        return false;
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
        if(customerRepository.findAll()!= null){
            for (Customer customer  : customerRepository.findAll()) {
                CustomerDTO customerDTO = new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getContacts());
                allCustomers.add(customerDTO);
            };
            return allCustomers;
        }

        return null;
    }
}
