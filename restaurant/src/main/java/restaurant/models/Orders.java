package restaurant.models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders_rcv")
public class Orders {
    @Id
    private Integer orders_id;
    private String dish;
    private String client_name;
    private String client_adress;
    private Integer amount;
    private Integer status;
    private String transactionId;

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_adress() {
        return client_adress;
    }

    public void setClient_adress(String client_adress) {
        this.client_adress = client_adress;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
