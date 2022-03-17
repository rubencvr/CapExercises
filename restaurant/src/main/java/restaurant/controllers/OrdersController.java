package restaurant.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.models.Orders;
import restaurant.repositories.OrdersRepository;

@RestController
@RequestMapping("/api/v1/orders_rcvr")
public class OrdersController {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@GetMapping
	public List<Orders> list(){
		return ordersRepository.findAll();
	}
	
	@PostMapping("/{id}")
	public Orders get(@PathVariable Integer id) {
		return ordersRepository.getOne(id);
	}
	
	@PostMapping("/createOrder")
	public Orders create(@RequestBody final Orders orders){
		return ordersRepository.saveAndFlush(orders);
	}
	
	@PostMapping("/deleteOrder/{id}")
	public void delete(@PathVariable Integer id) {
		ordersRepository.deleteById(id);
	}
	
	@PostMapping("/updateOrder")
	public Orders update(@PathVariable Integer id, @RequestBody Orders orders) {
		Orders existingOrders = ordersRepository.getOne(id);
		BeanUtils.copyProperties(orders, existingOrders, "orders_id");
		return ordersRepository.saveAndFlush(existingOrders);

	}


}