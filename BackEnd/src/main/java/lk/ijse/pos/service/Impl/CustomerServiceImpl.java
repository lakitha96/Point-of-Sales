package lk.ijse.pos.service.Impl;

import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.service.CustomerService;

import java.util.List;

/**
 * @author lakitha
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean save(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public CustomerDTO findByID(int id) {
        return null;
    }

    @Override
    public boolean update(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return null;
    }
}
