package lk.ijse.pos.dto;

import java.io.Serializable;

/**
 * @author lakitha
 */
public class CustomerDTO implements Serializable{
    private int id;
    private String name;
    private String address;
    private String contacts;

    public CustomerDTO() {
    }

    public CustomerDTO(int id, String name, String address, String contacts) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public CustomerDTO(String name, String address, String contacts) {
        this.name = name;
        this.address = address;
        this.contacts = contacts;
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
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}
