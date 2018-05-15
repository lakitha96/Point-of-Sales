package lk.ijse.pos.repository;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;

import java.io.Serializable;
import java.util.List;

/**
 * @author lakitha
 */

public interface ItemRepository {

    public Serializable save(Item item);

    public Item findByID (int id);

    public boolean update (Item item);

    public void delete (Item item);

    public List<Item> getAll ();

}
