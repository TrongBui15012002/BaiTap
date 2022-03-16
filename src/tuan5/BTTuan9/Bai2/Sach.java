package tuan5.BTTuan9.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String NhaXuatBan;
    Scanner n = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public Date getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }
     //nhập sách
    public void nhapSach() throws ParseException{
        System.out.println("__________________________________________");
        System.out.print("- Nhập mã sách: ");
        maSach = n.nextLine();
        System.out.print("- Nhập ngày nhập sách: ");
        ngayNhap = date.parse(n.nextLine());
        System.out.print("- Nhập đơn giá: ");
        donGia = n.nextDouble();
        n.nextLine();
        System.out.print("- Nhập số lượng: ");
        soLuong = n.nextInt();
        n.nextLine();
        System.out.println("- Nhập tên nhà xuất bản: ");
        NhaXuatBan = n.nextLine();
    }
    public void xuatSach(){
        System.out.println("-------------------------------------");
        System.out.println("- Mã Sách: "+maSach);
        System.out.println("- Ngày nhập: "+ngayNhap);
        System.out.println("- Đơn giá: "+donGia);
        System.out.println("- Số lượng: "+soLuong);
        System.out.println("- Nhà xuất bản: "+NhaXuatBan);
    }
    
    
}
