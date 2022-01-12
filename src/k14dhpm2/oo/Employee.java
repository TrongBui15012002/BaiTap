package k14dhpm2.oo;

import java.util.Scanner;

public class Employee {
    String employee_name;
    String employee_position;
    int employee_age;
    String employee_address;
    int employee_phone;
    Scanner input = new Scanner(System.in);
    void nhap(){
        System.out.print("- Nhập tên của nhân viên: ");
        employee_name = input.nextLine();
        System.out.print("- Nhập chức vụ của nhân viên: ");
        employee_position = input.nextLine();
        System.out.print("- Nhập tuổi của nhân viên: ");
        employee_age = input.nextInt();
        System.out.print("- Nhập địa chỉ của nhân viên: ");
        input.nextLine();
        employee_address = input.nextLine();
        System.out.print("- Nhập số điện thoại của nhân viên: ");
        employee_phone = input.nextInt();
    }
    void xuat(){
        System.out.println("_________________________________________");
        System.out.println("- Tên nhân viên: "+employee_age);
        System.out.println("- Chức vụ: "+employee_position);
        System.out.println("- Tuổi: "+employee_age);
        System.out.println("- Địa chỉ: "+employee_address);
        System.out.println("- Số điện thoại: "+employee_phone);
        System.out.println("_________________________________________");
    }
}
