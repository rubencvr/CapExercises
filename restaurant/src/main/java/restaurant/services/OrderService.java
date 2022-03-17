package restaurant.services;

import restaurant.models.Orders;
import restaurant.repositories.OrdersRepository;

import javax.persistence.criteria.Order;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrderService {
    final OrdersRepository ordersRepository;

    public OrderService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Transactional
    public Orders save(Orders orders) {
        orders.setTransactionId(UUID.randomUUID().toString());
        return ordersRepository.saveAndFlush(orders);
    }

    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    public Optional<Orders> findById(Integer id) {
        return ordersRepository.findById(id);
    }
    public Orders findByIdOrder(Integer id){
        return ordersRepository.getById(id);
    }
    @Transactional
    public void delete(Orders orders) {
        ordersRepository.delete(orders);
    }

}
