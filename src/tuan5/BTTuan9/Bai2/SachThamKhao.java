package tuan5.BTTuan9.Bai2;

import java.text.ParseException;
import java.util.Scanner;

public class SachThamKhao extends Sach{
    private double thue;
    Scanner n = new Scanner(System.in);
    @Override
    public void nhapSach() throws ParseException {
        // TODO Auto-generated method stub
        super.nhapSach();
        System.out.print("- Nhập thuế: ");
        thue = n.nextDouble();
    }
    @Override
    public void xuatSach() {
        // TODO Auto-generated method stub
        super.xuatSach();
        System.out.println("- Thuế: "+thue);
    }
    
}
