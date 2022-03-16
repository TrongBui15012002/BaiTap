package tuan4.buoi7;

import java.util.Scanner;

public class XeNgoaiThanh extends Xe{
    private String noiDen;
    private int soNgayDiduoc;
    Scanner nhap = new Scanner(System.in);

    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public int getSoNgayDiduoc() {
        return soNgayDiduoc;
    }
    public void setSoNgayDiduoc(int soNgayDiduoc) {
        this.soNgayDiduoc = soNgayDiduoc;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("+ Nhập nơi đến: ");
        noiDen = nhap.nextLine();
        System.out.print("+ Nhập số ngày đi được: " );
        soNgayDiduoc = nhap.nextInt();
    }
    
    @Override
    public String toString() {
        return super.toString()+noiDen+" "+soNgayDiduoc;


    }
    
}
