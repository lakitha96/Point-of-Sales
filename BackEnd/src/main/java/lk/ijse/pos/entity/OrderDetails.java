package lk.ijse.pos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author lakitha
 */
@Entity
@Table(name = "order_details")
public class OrderDetails implements Serializable{
    private int sold_order_qty;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="iid", referencedColumnName = "iid", insertable = false,updatable = false)
    private Item item;
    @EmbeddedId
    private OrderDetail_PK orderDetail_pk;

    public OrderDetails() {
    }

    public OrderDetails(int sold_order_qty, Orders orders, Item item, OrderDetail_PK orderDetail_pk) {
        this.sold_order_qty = sold_order_qty;
        this.orders = orders;
        this.item = item;
        this.orderDetail_pk = orderDetail_pk;
    }

    public int getSold_order_qty() {
        return sold_order_qty;
    }

    public void setSold_order_qty(int sold_order_qty) {
        this.sold_order_qty = sold_order_qty;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return sold_order_qty == that.sold_order_qty &&
                Objects.equals(orders, that.orders) &&
                Objects.equals(item, that.item) &&
                Objects.equals(orderDetail_pk, that.orderDetail_pk);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sold_order_qty, orders, item, orderDetail_pk);
    }
}
