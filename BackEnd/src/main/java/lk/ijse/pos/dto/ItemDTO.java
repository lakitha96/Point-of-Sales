package lk.ijse.pos.dto;

import java.io.Serializable;

/**
 * @author lakitha
 */
public class ItemDTO implements Serializable {
    private int id;
    private String name;
    private double price;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public ItemDTO(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "ItemDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
