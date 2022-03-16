package tuan4.buoi7;

import java.util.Scanner;

public class Xe {
    private String maSoChuyen;
    private String hoVaTenTX;
    private String soXe;
    private double doanhThu;
    Scanner n = new Scanner(System.in);
    public String getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public String getHoVaTenTX() {
        return hoVaTenTX;
    }
    public void setHoVaTenTX(String hoVaTenTX) {
        this.hoVaTenTX = hoVaTenTX;
    }
    public String getSoXe() {
        return soXe;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    //constructor
    public Xe(){

    }

    public void nhap(){
        System.out.println("______________________________________");
        System.out.print("+ Nhập mã số chuyến: ");
        maSoChuyen = n.nextLine();
        System.out.print("+ Nhập họ tên tài xế: ");
        hoVaTenTX = n.nextLine();
        System.out.print("+ Nhập số xe: ");
        soXe = n.nextLine();
        System.out.print("+ Nhập doanh thu: ");
        doanhThu = n.nextDouble();
    }
    public String toString(){
        String str = "Mã số chuyến: "+maSoChuyen+" Họ và tên tài xế:  "+hoVaTenTX+" Số xe: "+soXe+" Doanh thu: "+doanhThu+" ";
        return str;
    }
}
