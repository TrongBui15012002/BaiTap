package kiemtragiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    private String maHoaDon;
    private Date ngay;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;
    Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public String getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public Date getNgay() {
        return ngay;
    }
    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void nhapDS() throws ParseException{
        System.out.println("------------------------------------");
        System.out.print("+ Nhập mã của hóa đơn: ");
        maHoaDon = nhap.nextLine();
        System.out.print("+ Nhập ngày của hóa đơn: ");
        ngay = date.parse(nhap.nextLine());
        System.out.print("+ Nhập tên của khách hàng: ");
        tenKhachHang = nhap.nextLine();
        System.out.print("+ Nhập mã phòng: ");
        maPhong = nhap.nextLine();
        System.out.print("+ Nhập đơn giá: ");
        donGia = nhap.nextDouble();
        nhap.nextLine();
    }
    public String toString(){
        String ds = "+ Mã hóa đơn: "+maHoaDon+"\n+ Ngày: "+date.format(ngay)+
        "\n+ Tên khách hàng: "+tenKhachHang+"\n+ Mã phòng: "+maPhong+"\n+ Đơn giá: "+donGia;
        return ds;
    }

    
    
}
