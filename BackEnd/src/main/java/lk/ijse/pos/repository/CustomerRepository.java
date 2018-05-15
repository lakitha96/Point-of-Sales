package lk.ijse.pos.repository;

import lk.ijse.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author lakitha
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
