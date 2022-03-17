package restaurant.services;

import restaurant.models.Menu;
import restaurant.repositories.MenuRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class MenuService {
    final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Transactional
    public Menu save(Menu menu) {
        return menuRepository.saveAndFlush(menu);
    }

    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    public Optional<Menu> findById(Integer id) {
        return menuRepository.findById(id);
    }

    @Transactional
    public void delete(Menu menu) {
        menuRepository.delete(menu);
    }
}
