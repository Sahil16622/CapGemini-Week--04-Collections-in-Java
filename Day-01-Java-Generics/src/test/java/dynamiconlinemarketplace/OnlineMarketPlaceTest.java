package dynamiconlinemarketplace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OnlineMarketPlaceTest {

    @Test
    void testProductCreation() {
        // Creating products
        Book book = new Book("The Great Gatsby", 15.99, BookCategory.FICTION);
        Clothing shirt = new Clothing("Men's T-Shirt", 20.00, ClothingCategory.MEN);
        Gadget phone = new Gadget("Smartphone", 699.99, GadgetCategory.MOBILE);

        // Checking initial prices and names
        assertEquals("The Great Gatsby", book.getName());
        assertEquals(15.99, book.getPrice());

        assertEquals("Men's T-Shirt", shirt.getName());
        assertEquals(20.00, shirt.getPrice());

        assertEquals("Smartphone", phone.getName());
        assertEquals(699.99, phone.getPrice());
    }

    @Test
    void testApplyDiscount() {
        Book book = new Book("The Great Gatsby", 15.99, BookCategory.FICTION);
        book.applyDiscount(10); // 10% discount

        // New price should be 15.99 - 10% = 14.39
        assertEquals(14.39, book.getPrice(), 0.01); // Allowing small precision error
    }

    @Test
    void testCatalogFunctionality() {
        ProductCatalog catalog = new ProductCatalog();
        Book book = new Book("1984", 12.99, BookCategory.FICTION);
        catalog.addProduct(book);

        // Ensuring the product is added
        assertEquals(1, catalog.products.size());
    }
}

