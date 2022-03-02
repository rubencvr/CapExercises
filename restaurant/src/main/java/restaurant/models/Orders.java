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
@Table(name="orders_rcv")
public class Orders {
	@Id
	private Long orders_id;
	private String dish;
	private String client_name;
	private String client_adress;
	private int amount;
	private int status;
	private Timestamp creation_time;
	private Timestamp update_time;
	
	
	Long getOrders_id() {
		return orders_id;
	}
	void setOrders_id(Long orders_id) {
		this.orders_id = orders_id;
	}
	String getDish() {
		return dish;
	}
	void setDish(String dish) {
		this.dish = dish;
	}
	String getClient_name() {
		return client_name;
	}
	void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	String getClient_adress() {
		return client_adress;
	}
	void setClient_adress(String client_adress) {
		this.client_adress = client_adress;
	}
	int getAmount() {
		return amount;
	}
	void setAmount(int amount) {
		this.amount = amount;
	}
	int getStatus() {
		return status;
	}
	void setStatus(int status) {
		this.status = status;
	}
	Timestamp getCreation_time() {
		return creation_time;
	}
	void setCreation_time(Timestamp creation_time) {
		this.creation_time = creation_time;
	}
	Timestamp getUpdate_time() {
		return update_time;
	}
	void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	
	
	
}
