package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String tenSV;
    private String diaChi;
    private int sdt;
    public int getMssv() {
        return mssv;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
    public String getTenSV() {
        return tenSV;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public int getSđt() {
        return sdt;
    }
    public void setSđt(int sdt) {
        this.sdt = sdt;
    }
    public SinhVien(){

    }
    public SinhVien(int mssv, String tenSV, String diaChi, int sdt){
        this.mssv = mssv;
        this.tenSV = tenSV;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    @Override
    public String toString(){
        String str = String.format("%-20d%-20s%-20s%-20d\n", mssv, tenSV, diaChi, sdt);
        return str;
    }
    Scanner n = new Scanner(System.in);
    void nhapThongTin(){
        System.out.println("_________________________________________________");
        System.out.print("- Nhập mã số sinh viên: ");
        mssv = n.nextInt();
        n.nextLine();
        System.out.print("- Nhập họ và tên sinh viên: ");
        tenSV = n.nextLine();
        System.out.print("- Nhập địa chỉ của sinh viên: ");
        diaChi = n.nextLine();
        System.out.print("- Nhập số điện thoại của sinh viên: ");
        sdt = n.nextInt();
    }
    
    
}
