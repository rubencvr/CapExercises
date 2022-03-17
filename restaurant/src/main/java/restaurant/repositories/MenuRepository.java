package restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
