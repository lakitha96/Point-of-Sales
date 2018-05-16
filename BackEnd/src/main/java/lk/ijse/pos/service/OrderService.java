package lk.ijse.pos.service;

import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.OrderDTO;
import lk.ijse.pos.dto.OrderDetailDTO;
import lk.ijse.pos.dto.PlacOrderDTO;
import lk.ijse.pos.entity.OrderDetails;

import java.util.List;

/**
 * @author lakitha
 */
public interface OrderService {
    public boolean save(PlacOrderDTO placOrderDTO);
}
