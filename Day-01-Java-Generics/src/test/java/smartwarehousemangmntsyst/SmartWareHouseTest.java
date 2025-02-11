package smartwarehousemangmntsyst;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class SmartWareHouseTest {

    @Test
    void testStorageFunctionality() {
        // Create storages
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items
        electronicsStorage.addItem(new Electronics("Laptop"));
        groceriesStorage.addItem(new Groceries("Apple"));
        furnitureStorage.addItem(new Furniture("Chair"));

        // Check storage size
        assertEquals(1, electronicsStorage.getItems().size());
        assertEquals(1, groceriesStorage.getItems().size());
        assertEquals(1, furnitureStorage.getItems().size());

        // Check stored item names
        assertEquals("Laptop", electronicsStorage.getItems().get(0).getName());
        assertEquals("Apple", groceriesStorage.getItems().get(0).getName());
        assertEquals("Chair", furnitureStorage.getItems().get(0).getName());
    }

    @Test
    void testWildcardDisplay() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("TV"));

        // Ensure wildcard method runs without errors
        assertDoesNotThrow(() -> Storage.displayItems(electronicsStorage.getItems()));
    }
}

