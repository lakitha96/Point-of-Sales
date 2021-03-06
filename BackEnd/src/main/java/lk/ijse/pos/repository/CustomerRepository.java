package lk.ijse.pos.repository;

import lk.ijse.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lakitha
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
