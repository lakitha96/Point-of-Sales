package lk.ijse.pos.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author lakitha
 */

@Entity
@Table(name = "customer")
public class Customer implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String address;
    private String contacts;

    public Customer() {
        System.out.println("In Customer Entity");
    }

    public Customer(String name, String address, String contacts) {
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public Customer(int cid, String name, String address, String contacts) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return cid == customer.cid &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(contacts, customer.contacts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, name, address, contacts);
    }
}
