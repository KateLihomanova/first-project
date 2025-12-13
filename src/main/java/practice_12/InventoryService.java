package practice_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {
    public static boolean isInventoryOpen = true;
    private  Map<String, List<Product>> inventory = new HashMap<>();

    public void setInventoryOpen(boolean open) {
        this.isInventoryOpen = open;
    }

    public synchronized void addProduct(Product product) {
        if (!isInventoryOpen) return;
        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>())
                .add(product);
    }

    public synchronized Product getProductByCategory(String category) {
        List<Product> products = inventory.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Товары в данной категории отсутствуют");
        }
        return products.remove(0);
    }

    public List<Product> filterByPrice(double minPrice) {
        return inventory.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }

    public List<Product> getAllByCategory(String category) {
        return new ArrayList<>(inventory.getOrDefault(category, List.of()));
    }




}
