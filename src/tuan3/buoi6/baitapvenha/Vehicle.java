package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private double triGia;
    private double dungTich;
    private double thue;
    Scanner nhap = new Scanner(System.in);
    public String getTenChuXe() {
        return tenChuXe;
    }
    public void setTenChuXe() {
        String tenChuXe;
        System.out.print("- Nhập tên chủ xe: ");
        tenChuXe = nhap.nextLine();
        this.tenChuXe = tenChuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }
    public void setLoaiXe() {
        String loaiXe;
        System.out.print("- Nhập loại xe: ");
        loaiXe = nhap.nextLine();
        this.loaiXe = loaiXe;
    }
    public double getTriGia() {
        return triGia;
    }
    public void setTriGia() {
        double triGia;
        System.out.print("- Nhập trị giá của xe: ");
        triGia = nhap.nextDouble();
        this.triGia = triGia;
        nhap.nextLine();
    }
    public double getDungTich() {
        return dungTich;
    }
    public void setDungTich() {
        double dungTich;
        System.out.print("- Nhập dung tích xe: ");
        dungTich = nhap.nextDouble();
        this.dungTich = dungTich;
        nhap.nextLine();
    }
    public double getThue() {
        return thue;
    }
    public void setThue() {
        double thue = 0;
        if(dungTich < 100){
            thue += 0.01 * triGia;
        }else if(dungTich < 200){
            thue += 0.03 * triGia;
        }else{
            thue += thue * 0.05;
        }
        this.thue = thue;
    }
    void inThongTin(){
        System.out.printf("%-25s %-25s %10s %10s %10s \n", getTenChuXe(), getLoaiXe(), getDungTich(), getTriGia(), getThue());
    }
    void nhapThongTin(){
        System.out.println("=====================================");
        System.out.print("- Nhập tên chủ xe: ");
        tenChuXe = nhap.nextLine();
        System.out.print("- Nhập loại xe: ");
        loaiXe = nhap.nextLine();
        System.out.print("- Nhập dung tích xe: ");
        dungTich = nhap.nextDouble();
        nhap.nextLine();
        System.out.print("- Nhập trị giá của xe: ");
        triGia = nhap.nextDouble();
        nhap.nextLine();
    }


    
}
