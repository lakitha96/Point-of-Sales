package lk.ijse.pos.repository;

import lk.ijse.pos.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lakitha
 */
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
