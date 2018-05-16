package lk.ijse.pos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author lakitha
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private String date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cid")
    private Customer customer;


    public Orders() {
    }


    public Orders(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public Orders(int oid, String date, Customer customer) {
        this.oid = oid;
        this.date = date;
        this.customer = customer;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return oid == orders.oid &&
                Objects.equals(date, orders.date) &&
                Objects.equals(customer, orders.customer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(oid, date, customer);
    }
}
