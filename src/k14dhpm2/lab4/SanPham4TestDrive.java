package k14dhpm2.lab4;

public class SanPham4TestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("sữa", 30000, 1500);
        sp1.xuat();

        String ten = sp1.getTenSanPham();
        System.out.println("- Tên sản phẩm: "+ten);
        sp1.setTenSanPham("-Táo");
        sp1.xuat();


    }
    
}
