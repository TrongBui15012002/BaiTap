package tuan3.buoi6;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String hoVaTen;
    private float diemTH;
    private float diemLT;
    Scanner a = new Scanner(System.in);
    public SinhVien(){

    }
    public SinhVien(int mssv, String hoVaTen, float diemTH, float diemLT){
        this.mssv =mssv;
        this.hoVaTen = hoVaTen;
        this.diemTH = diemTH;
        this.diemLT = diemLT;
    }
    public int getMssv() {
        return mssv;
    }
    public void setMssv() {
        int mssv;
        System.out.print("- Nhập mã số sinh viên: ");
        mssv = a.nextInt();
        this.mssv = mssv;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen() {
        String hoVaTen;
        System.out.print("- Nhập họ và tên: ");
        a.nextLine();
        hoVaTen = a.nextLine();
        this.hoVaTen = hoVaTen;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public void setDiemTH() {
        float diemTH;
        System.out.print("- Nhập điểm thực hành: ");
        diemTH = a.nextFloat();
        this.diemTH = diemTH;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT() {
        float diemLT;
        System.out.print("- Nhập điểm lí thuyết: ");
        a.nextLine();
        diemLT = a.nextFloat();
        this.diemLT = diemLT;
    }
    public double tinhDiemTB(){
        return (this.diemLT+this.diemTH)/2;
    }
    public String toString(){
        String str = "- MSSV: "+this.mssv+" - Ho va ten: "+this.hoVaTen+" - Diem thuc hanh: "+this.diemTH+" - Diem li thuyet: "+this.diemLT+" - Diem trung binh: %5.2f"+this.tinhDiemTB();
        return str; 
    }
    
}
