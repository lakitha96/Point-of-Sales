package lk.ijse.pos.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author lakitha
 */
public class ItemDTO implements Serializable {
    private int iid;
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

    public ItemDTO(int iid, String name, double price, int qty) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return iid == itemDTO.iid &&
                Double.compare(itemDTO.price, price) == 0 &&
                qty == itemDTO.qty &&
                Objects.equals(name, itemDTO.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(iid, name, price, qty);
    }
}
