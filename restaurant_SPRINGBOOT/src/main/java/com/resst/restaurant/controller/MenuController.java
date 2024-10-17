package com.resst.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.resst.restaurant.model.Menu;
import com.resst.restaurant.service.MenuService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // Get all menu items
    @GetMapping
    public ResponseEntity<List<Menu>> getAllMenu() {
        List<Menu> menus = menuService.getAllMenu();
        return ResponseEntity.ok(menus);
    }

    // Get a single menu item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable Long id) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            return ResponseEntity.ok(menu);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Add a new menu item
    @PostMapping
    public ResponseEntity<Menu> addMenu(@Valid @RequestBody Menu menu) {
        Menu createdMenu = menuService.addMenu(menu);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMenu);
    }

    // Delete a menu item by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            menuService.deleteMenu(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
