package com.example.hello_spring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private List<Item> items = new ArrayList<>();

    public InventoryService() {
        // Sample inventory
        items.add(new Item(1L, "Book", 10.99, 50));
        items.add(new Item(2L, "Laptop", 999.99, 10));
    }

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null; // Not found
    }

    public String addItem(Item newItem) {
        items.add(newItem);
        return "Added: " + newItem.getName();
    }

    public String updateStock(Long id, Integer newStock) {
        Item item = getItemById(id);
        if (item != null) {
            item.setStock(newStock);
            return "Stock updated for " + item.getName() + " to " + newStock;
        }
        return "Item not found!";
    }
}