package k14dhpm2.lab4;

public class SanPham3TestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Bánh quy", 25000);
        SanPham sp2 = new SanPham("Bánh tráng", 10000, 1000);
        sp1.xuat();
        sp2.xuat();
    }
    
}
