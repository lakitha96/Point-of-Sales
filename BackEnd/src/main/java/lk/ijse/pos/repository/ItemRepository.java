package lk.ijse.pos.repository;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author lakitha
 */

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{ }
