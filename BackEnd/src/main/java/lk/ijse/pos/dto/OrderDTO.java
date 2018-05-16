package lk.ijse.pos.dto;

import java.io.Serializable;

/**
 * @author lakitha
 */
public class OrderDTO implements Serializable{

    private int oid;
    private int cusID;
    private String date;

    public OrderDTO() {
    }

    public OrderDTO(int oid, int cusID, String date) {
        this.oid = oid;
        this.cusID = cusID;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
