package lk.ijse.pos.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author lakitha
 */

@Embeddable
public class OrderDetail_PK implements Serializable{
    private int oid;
    private int iid;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int oid, int iid) {
        this.oid = oid;
        this.iid = iid;
    }
}
