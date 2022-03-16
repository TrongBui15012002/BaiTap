package tuan4.buoi7;

import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        XeNoiThanh xeNoiThanh[] = null;
        XeNgoaiThanh xeNgoaithanh[] = null;
        Scanner nhap = new Scanner(System.in);
        System.out.println("---- Xe nội thành----");
        System.out.print("- Nhập số xe nội thành: ");
        int a = nhap.nextInt();
        xeNoiThanh = new XeNoiThanh[a];
        for(int i = 0;i < a;i++){
            xeNoiThanh[i] = new XeNoiThanh();
            xeNoiThanh[i].nhap();
        }
        double tong = 0;
        for(int i = 0;i < a;i++){
            System.out.println("_____________________________________________________");
            System.out.println(xeNoiThanh[i].toString());
            tong += xeNoiThanh[i].getDoanhThu();
        }
        System.out.println("- Tổng doanh thu xe nội thành: "+tong);
        System.out.println("_____________________________________________________");
        System.out.println("---- Xe ngoại thành---- ");
        System.out.print("- Nhập số xe ngoại thành: ");
        a = nhap.nextInt();
        xeNgoaithanh = new XeNgoaiThanh[a];
        tong = 0;
        for(int i = 0;i < a;i++){
            xeNgoaithanh[i] = new XeNgoaiThanh();
            xeNgoaithanh[i].nhap();
        }
        for(int i = 0;i < a;i++){
            System.out.println("_____________________________________________________");
            System.out.println(xeNgoaithanh[i].toString());
            tong += xeNgoaithanh[i].getDoanhThu();
        }
        System.out.println("- Tổng doanh thu xe ngoại thành: "+tong);

    }
    
}
