package tuan3.buoi6.baitapvenha;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
    Scanner n = new Scanner(System.in);
    //HÀM TẠO
    public Account(){

    }
    public Account(long soTK, String tenTK, double soTienTrongTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }
    //GET, SET
    public long getSoTK() {
        return soTK;
    }
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }
    public String getTenTK() {
        return tenTK;
    }
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }
    public void setSoTientrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
    public String tienTe(){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String tt = currencyVN.format(soTienTrongTK);
        return tt;
    }
    //HÀM NHẬP THÔNG TIN 
    void nhapThongTin(){
        System.out.print("+ Nhập số tài khoản: ");
        soTK = n.nextLong();
        n.nextLine();
        System.out.print("+ Nhập tên tài khoản: ");
        tenTK = n.nextLine();
        System.out.print("+ Nhập số tiền có trong tài khoản: ");
        soTienTrongTK = n.nextDouble();
        System.out.println("_______________________________________________");
    }
    //HẰNG LÃI XUẤT
    public static final double laiXuat = 0.035;
    //HÀM TẠO
    public Account(long soTK, String tenTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = 50;
    }
    //HÀM NẠP TIỀN
    double napTien(double tienNap){
        soTienTrongTK += tienNap;
        return soTienTrongTK;
    }
    //HÀM RÚT TIỀN
    double rutTien(double tienRut){
        soTienTrongTK -= tienRut;
        return soTienTrongTK;
    }
    //HÀM ĐÁO HẠN
    double daoHan(){
        soTienTrongTK += soTienTrongTK * laiXuat;
        return soTienTrongTK;
    }
    //HÀM CHUYỂN TIỀN
    double chuyenTien(double tienChuyen){
        soTienTrongTK -= tienChuyen;
        return soTienTrongTK;
    }
    //HÀM IN
    public String toString(){
        String str = "Số tài khoản: "+getSoTK()+"  Tên tài khoản: "+getTenTK()+"  Số tiền trong tài khoản: "+tienTe();
        System.out.println(str);
        return str;
    }
    
    
}
