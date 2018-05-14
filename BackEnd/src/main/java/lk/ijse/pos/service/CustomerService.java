package lk.ijse.pos.service;

import lk.ijse.pos.dto.CustomerDTO;

import java.util.List;

/**
 * @author lakitha
 */
public interface CustomerService {

    public boolean save(CustomerDTO customerDTO);

    public CustomerDTO findByID (int id);

    public boolean update (CustomerDTO customerDTO);

    public boolean delete (int id);

    public List<CustomerDTO> findAll ();

}
