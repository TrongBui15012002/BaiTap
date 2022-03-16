package kiemtragiuaki;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonNgay extends HoaDon{
    Scanner nhap = new Scanner(System.in);
    private int soNgay;
    public int getSoNgay() {
        return soNgay;
    }
    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    @Override
    public void nhapDS() throws ParseException {
        super.nhapDS();
        System.out.print("+ Nhập số ngày: ");
        soNgay = nhap.nextInt();
    }
    @Override
    public String toString() {
        return super.toString() + "\n+ Số ngày: "+soNgay;
    }
}
