package restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.models.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
