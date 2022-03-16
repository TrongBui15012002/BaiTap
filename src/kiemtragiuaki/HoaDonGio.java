package kiemtragiuaki;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonGio extends HoaDon{
    Scanner nhap = new Scanner(System.in);
    private int soGio;
public int getSoGio() {
        return soGio;
    }
public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
@Override
public void nhapDS() throws ParseException {
    super.nhapDS();
    System.out.print("+ Nhập số giờ thuê: ");
    soGio = nhap.nextInt();
}
@Override
public String toString() {
    return super.toString() + "\n+ Số giờ: "+soGio;
}
    
}
