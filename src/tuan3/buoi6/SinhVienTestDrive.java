package tuan3.buoi6;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(2008110320, "Bui Thi Trong", 8.5f, 7.5f);
        SinhVien sv2 = new SinhVien(1234567890, "Co Thi Thuy An", 8f, 9f);
        SinhVien sv3 = new SinhVien();
        sv3.setMssv();
        sv3.setHoVaTen();
        sv3.setDiemTH();
        sv3.setDiemLT();
        System.out.printf("%-30s %-30s%6s %6s %6s \n", "MSSV", "Hovaten", "ĐTH", "ĐLT", "ĐTB");
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv1.getMssv(), sv1.getHoVaTen(), sv1.getDiemTH(), sv1.getDiemLT(), sv1.tinhDiemTB());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv2.getMssv(), sv2.getHoVaTen(), sv2.getDiemTH(), sv2.getDiemLT(), sv2.tinhDiemTB());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv3.getMssv(), sv3.getHoVaTen(), sv3.getDiemTH(), sv3.getDiemLT(), sv3.tinhDiemTB());
    
    }
    
}
