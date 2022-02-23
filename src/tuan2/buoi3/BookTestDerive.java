package tuan2.buoi3;

public class BookTestDerive {
    public static void main(String[] args) {
        Book b = new Book("Doraemon", "truyện tranh", 100, 1500);
        Book c = new Book("Conan", "Truyện tranh", 50, 2000);
        b.show_book();
        c.show_book();

        b = c;
        b.show_book();
        c.show_book();

        c = null;
        b.show_book();
    }
    
}
