package dynamiconlinemarketplace;

// Specific Product classes
class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }
}
