package k14dhpm2.oo;

import java.util.Scanner;

public class Customer {
    String customer_name;
    String customer_address;
    int customer_phone;
    Scanner input = new Scanner(System.in);

    void nhap(){
        System.out.print("- Nhập tên khách hàng: ");
        customer_name = input.nextLine();
        System.out.print("- Nhập địa chỉ của khách hàng: ");
        customer_address = input.nextLine();
        System.out.print("- Nhập số điện thoại khách hàng: ");
        customer_phone = input.nextInt();
    }
    void xuat(){
        System.out.println("_________________________________________");
        System.out.println("- Tên khách hàng: " +customer_address);
        System.out.println("- Địa chỉ: " +customer_address);
        System.out.println("- Số điện thoại: " +customer_phone);
        System.out.println("_________________________________________");
    }
}
