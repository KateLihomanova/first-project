package practice_12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class InventoryServiceTest {

    @Test
    void testAddProduct() {
        InventoryService service = new InventoryService();
        Product cottageCheese = new Product("Творог", 80, "Молочные продукты");
        service.addProduct(cottageCheese);
        Product retrieved = service.getProductByCategory("Молочные продукты");
        assertEquals("Творог", retrieved.getName());
    }

    @Test
    void testAddProductWhenInventoryClosed() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);
        service.addProduct(new Product("Ручка", 5, "Канцелярия"));
        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Канцелярия"));
    }

    @Test
    void testOutOfStock() {
        InventoryService service = new InventoryService();
        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Books"));
    }

    @Test
    void testFilterByPrice() {
        InventoryService service = new InventoryService();
        service.addProduct(new Product("Тетрадь", 10, "Канцелярия"));
        service.addProduct(new Product("Компьютер", 1000, "Электроника"));
        List<Product> filtered = service.filterByPrice(100);
        assertEquals(1, filtered.size());
        assertEquals("Компьютер", filtered.get(0).getName());
    }


}
