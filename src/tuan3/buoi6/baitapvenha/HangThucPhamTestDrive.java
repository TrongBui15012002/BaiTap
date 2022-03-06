package tuan3.buoi6.baitapvenha;

import java.text.ParseException;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        HangThucPham hangThucPham1 = new HangThucPham(12345, "bánh ngọt", 15000, "15/01/2019", "08/02/2020");
        HangThucPham hangThucPham2 = new HangThucPham(654321, "kẹo", 2000, "06/03/2021", "8/3/2022");
        hangThucPham1.toString();
        hangThucPham1.kiemTraHSD();
        hangThucPham2.toString();
        hangThucPham2.kiemTraHSD();
    }
    
}
