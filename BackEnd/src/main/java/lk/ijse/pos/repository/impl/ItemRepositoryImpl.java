package lk.ijse.pos.repository.impl;

import lk.ijse.pos.entity.Item;
import lk.ijse.pos.repository.ItemRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author lakitha
 */
@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(Item item) {
        System.out.println("saveRepItem");

        return currentSession().save(item);
    }

    @Override
    public Item findByID(int id) {
        Item item = currentSession().get(Item.class, id);
        currentSession().clear();
        return item;
    }

    @Override
    public boolean update(Item item) {
        currentSession().update(item);
        return true;
    }

    @Override
    public void delete(Item item) {
        currentSession().delete(item);
    }

    @Override
    public List<Item> getAll() {
        return currentSession().createCriteria(Item.class).list();
    }
}
