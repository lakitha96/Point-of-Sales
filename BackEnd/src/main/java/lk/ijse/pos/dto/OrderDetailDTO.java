package lk.ijse.pos.dto;

import lk.ijse.pos.entity.Item;
import lk.ijse.pos.entity.Orders;

import java.io.Serializable;

/**
 * @author lakitha
 */
public class OrderDetailDTO implements Serializable {

    private int sold_order_qty;
    private ItemDTO itemDTO;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int sold_order_qty, ItemDTO itemDTO) {
        this.sold_order_qty = sold_order_qty;
        this.itemDTO = itemDTO;
    }

    public int getSold_order_qty() {
        return sold_order_qty;
    }

    public void setSold_order_qty(int sold_order_qty) {
        this.sold_order_qty = sold_order_qty;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }
}
