package restaurant.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="menu_rcvr")
public class Menu {
	@Id
	private Long menu_id;
	private String dish;
	private Date start_date;
	private Date end_date;
	private int active;
	

	Long getMenu_id() {
		return menu_id;
	}


	void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}


	String getDish() {
		return dish;
	}


	void setDish(String dish) {
		this.dish = dish;
	}


	Date getStart_date() {
		return start_date;
	}


	void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	Date getEnd_date() {
		return end_date;
	}


	void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	int getActive() {
		return active;
	}


	void setActive(int active) {
		this.active = active;
	}


	public Menu() {
		
	}	
	
    
}
