package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSi;
    private int soBaiHat;
    private double giaThanh;
    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public String getCaSi() {
        return caSi;
    }
    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
    public double getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }
    public CD(){

    }
        
    public CD(int maCD, String tuaCD, String caSi, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    @Override
    public String toString(){
        String ctr = String.format("%-20d%-20s%-20s%-20d%-20f", maCD, tuaCD, caSi, soBaiHat, giaThanh);
        return ctr;
    }
    Scanner n = new Scanner(System.in);
    void nhapCD(){
        System.out.println("____________________________________");
        System.out.print("- Nhập mã CD: ");
        maCD = n.nextInt();
        n.nextLine();
        System.out.print("- Nhập tựa CD: ");
        tuaCD = n.nextLine();
        System.out.print("- Nhập tên ca sĩ: ");
        caSi = n.nextLine();
        System.out.print("- Nhập số bài hát: ");
        soBaiHat = n.nextInt();
        n.nextLine();
        System.out.print("- Nhập giá thành: ");
        giaThanh = n.nextDouble();
    }

    
    
}
