package lk.ijse.pos.repository.impl;

import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author lakitha
 */

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean save(Customer customer) {
        Serializable save = currentSession().save(customer);
        if (save != null){
            return true;
        }
        return false;
    }

    @Override
    public Customer findByID(int id) {
        Customer customer = currentSession().get(Customer.class, id);
        currentSession().clear();
        return customer;
    }

    @Override
    public boolean update(Customer customer) {
        currentSession().update(customer);
        return true;
    }

    @Override
    public void delete(Customer customer) {
        currentSession().delete(customer);
    }

    @Override
    public List<Customer> getAll() {
        return currentSession().createCriteria(Customer.class).list();
    }


}
