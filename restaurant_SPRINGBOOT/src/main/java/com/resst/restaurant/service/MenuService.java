package com.resst.restaurant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.resst.restaurant.model.Menu;
import com.resst.restaurant.repository.MenuRepository;


@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public Menu getMenuById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }

    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}
