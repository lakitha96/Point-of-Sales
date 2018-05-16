package lk.ijse.pos.repository;

import lk.ijse.pos.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lakitha
 */
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{
}
