package dynamiconlinemarketplace;

public class OnlineMarketPlace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Creating products
        Book book1 = new Book("The Great Gatsby", 15.99, BookCategory.FICTION);
        Clothing shirt = new Clothing("Men's T-Shirt", 20.00, ClothingCategory.MEN);
        Gadget phone = new Gadget("Smartphone", 699.99, GadgetCategory.MOBILE);

        // Adding products to catalog
        catalog.addProduct(book1);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display before discount
        System.out.println("Catalog Before Discount:");
        catalog.showCatalog();

        // Applying discounts
        book1.applyDiscount(10);
        shirt.applyDiscount(15);
        phone.applyDiscount(5);

        // Display after discount
        System.out.println("\nCatalog After Discount:");
        catalog.showCatalog();
    }
}