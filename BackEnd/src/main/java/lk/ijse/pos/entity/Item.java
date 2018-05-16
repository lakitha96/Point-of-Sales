package lk.ijse.pos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author lakitha
 */

@Entity
@Table(name = "item")
public class Item implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int iid;
    private String name;
    private double price;
    private int qty;

    public Item() {
    }

    public Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Item(int iid, String name, double price, int qty) {
        this.iid = iid;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iid=" + iid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
