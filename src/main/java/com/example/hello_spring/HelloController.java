package com.example.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/inventory")
public class HelloController {
    @Autowired
    private InventoryService inventoryService; // Dependency injection

    // GET all items
    @GetMapping
    public List<Item> getAllItems() {
        return inventoryService.getAllItems();
    }

    // GET item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return inventoryService.getItemById(id);
    }

    // POST to add a new item
    @PostMapping
    public String addItem(@RequestBody Item newItem) {
        return inventoryService.addItem(newItem);
    }

    // PUT to update stock
    @PutMapping("/{id}/stock")
    public String updateStock(@PathVariable Long id, @RequestBody Integer newStock) {
        return inventoryService.updateStock(id, newStock);
    }
}