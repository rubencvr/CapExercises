package restaurant.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import restaurant.models.Menu;
import restaurant.repositories.MenuRepository;

@RestController
@RequestMapping("/api/v1/menu_rcvr")
public class MenuController {

	@Autowired
	private MenuRepository menuRepository;
	
	@GetMapping
	public List<Menu> list(){
		return menuRepository.findAll();
	}
	
	@PostMapping("/{id}")
	public Menu get(@PathVariable Integer id) {
		return menuRepository.getOne(id);
	}
	
	@PostMapping("/addMenu")
	public Menu create(@RequestBody Menu menu){
		menuRepository.saveAndFlush(menu);
		if(menu.equals(get(menu.getid()))){
			return new ResponseEntity<>("OK", "2022-02 18:00:15", "200",
					"00505682-6017-1eea-84d6-b19d557c24c1",
					"Menu add Success",
					HttpStatus.OK);
		}
		return new ResponseEntity<>("NOK","2022-02 18:00:15", "500",
				"00505682-6017-1eea-84d6-b19d557c24c1",
				"Error: Fetch the error",
				HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/deleteMenu/{id}")
	public void delete(@PathVariable Integer id) {
		menuRepository.deleteById(id);
	}
	
	@PostMapping("/updateMenu")
	public Menu update(@PathVariable Integer id, @RequestBody Menu menu) {
		Menu existingMenu = menuRepository.getOne(id);
		return menuRepository.saveAndFlush(existingMenu);

	}
}
