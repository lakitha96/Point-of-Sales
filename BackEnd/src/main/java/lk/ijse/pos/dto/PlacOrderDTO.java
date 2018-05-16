package lk.ijse.pos.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author lakitha
 */
public class PlacOrderDTO implements Serializable {

    private OrderDTO orderDTO;
    private List<OrderDetailDTO> allOrderDetailsDTO;

    public PlacOrderDTO() {
    }

    public PlacOrderDTO(OrderDTO orderDTO, List<OrderDetailDTO> allOrderDetailsDTO) {
        this.orderDTO = orderDTO;
        this.allOrderDetailsDTO = allOrderDetailsDTO;
    }

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public List<OrderDetailDTO> getAllOrderDetailsDTO() {
        return allOrderDetailsDTO;
    }

    public void setAllOrderDetailsDTO(List<OrderDetailDTO> allOrderDetailsDTO) {
        this.allOrderDetailsDTO = allOrderDetailsDTO;
    }

    @Override
    public String toString() {
        return "PlacOrderDTO{" +
                "orderDTO=" + orderDTO +
                ", allOrderDetailsDTO=" + allOrderDetailsDTO +
                '}';
    }
}
