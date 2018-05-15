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
@Transactional
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
        Customer customer = (Customer) currentSession().createQuery("from Customer where id='" + id+ "'").list().get(0);
        return customer;
    }

    @Override
    public boolean update(Customer customer) {
        currentSession().update(customer);
        return true;
    }

    @Override
    public boolean delete(int id) {
        currentSession().delete(findByID(id));
        return true;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> allCus = currentSession().createQuery("FROM " + Customer.class.getSimpleName()).list();
        System.out.println(allCus.isEmpty() + " check all cus ");
        return allCus;
    }


}
