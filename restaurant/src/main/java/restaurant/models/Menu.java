package restaurant.models;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="menu_rcvr")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String dish;
	private Date start_date;
	private Date end_date;
	private Integer active;

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
}
