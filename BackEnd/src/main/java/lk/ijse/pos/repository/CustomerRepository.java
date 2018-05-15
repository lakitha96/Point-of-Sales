package lk.ijse.pos.repository;

import lk.ijse.pos.entity.Customer;

import java.util.List;

/**
 * @author lakitha
 */
public interface CustomerRepository  {

    public boolean save(Customer customer);

    public Customer findByID (int id);

    public boolean update (Customer customer);

    public boolean delete (int id);

    public List<Customer> getAll ();
}
