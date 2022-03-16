package tuan4.buoi7;

import java.util.Scanner;

public class XeNoiThanh extends Xe{
    private int soTuyen;
    private double soKmDiDuoc;
    Scanner nhap = new Scanner(System.in);
    public int getSoTuyen() {
        return soTuyen;
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("+ Nhập số tuyến: ");
        soTuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Nhập số Km đi được: ");
        soKmDiDuoc = nhap.nextDouble();
    }
    @Override
    public String toString() {
        return super.toString()+soTuyen+" "+soKmDiDuoc;
    }
    
}
