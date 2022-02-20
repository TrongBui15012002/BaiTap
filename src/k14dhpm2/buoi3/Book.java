package k14dhpm2.buoi3;

public class Book {
    String book_name;
    String book_type;
    int quantily;
    double saleprice;

    public Book(){
        
    }

    public Book(String book_name, String book_type, int quantily, double saleprice) {
        this.book_name = book_name;
        this.book_type = book_type;
        this.quantily = quantily;
        this.saleprice = saleprice;
    }

    void show_book(){
        System.out.println("- Tên sách: "+book_name);
        System.out.println("- Loại: "+book_type);
        System.out.println("- Số lượng: "+quantily);
        System.out.println("- Giá bán: "+saleprice);
        System.out.println("____________________________");
    }
    
}
