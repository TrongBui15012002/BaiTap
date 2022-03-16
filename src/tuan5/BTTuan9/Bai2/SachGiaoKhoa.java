package tuan5.BTTuan9.Bai2;

import java.text.ParseException;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;
    Scanner n = new Scanner(System.in);
    @Override
    public void nhapSach() throws ParseException {
        // TODO Auto-generated method stub
        super.nhapSach();
        System.out.println("- Nhập tình trạng xe: ");
        tinhTrang = n.nextLine();

    }
    @Override
    public void xuatSach() {
        // TODO Auto-generated method stub
        super.xuatSach();
        System.out.println("- Tình trạng xe: "+tinhTrang);
    }
    
}
