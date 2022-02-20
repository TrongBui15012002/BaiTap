package k14dhpm2.lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private Double donGia;
    private Double giamGia;
    Scanner a = new Scanner(System.in);

    public String getTenSanPham(){
        return tenSP;
    }
    public void setTenSanPham(String tenSP){
        this.tenSP = tenSP;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    } 
    public double getGiamGia(){
        return giamGia;
    }
    public void setgiamGia(double giamGia){
        this.giamGia = giamGia; 
    }
    public SanPham(){

    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia){
        this(tenSP, donGia, 0);
    }

    private Double getThueNhapKhau(){
        return 0.1*donGia;
    }

    void nhap(){
        System.out.println("____________________________________");
        System.out.print("- Nhập tên sản phẩm: ");
        tenSP = a.nextLine();
        System.out.print("- Nhập giá của sản phẩm: ");
        donGia = a.nextDouble();
        a.nextLine();
        giamGia = 0.2*donGia;
        System.out.println("- Giảm giá: "+giamGia);
        System.out.println("____________________________________");
    }
    public void xuat(){
        System.out.println("____________________________________");
        System.out.println("- Tên sản phẩm: "+tenSP);
        System.out.println("- Giá: "+donGia);
        System.out.println("- Giảm giá: "+giamGia);
        System.out.println("- Thuế nhập khẩu: "+getThueNhapKhau());
        System.out.println("____________________________________");
     }
    
}
