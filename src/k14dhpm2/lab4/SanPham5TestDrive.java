package k14dhpm2.lab4;

import java.util.ArrayList;

public class SanPham5TestDrive {
    public static void main(String[] args) {
        ArrayList <SanPham> list = new ArrayList<SanPham>();
        SanPham sp1 = new SanPham("coca", 10000, 0);
        SanPham sp2 = new SanPham("pepsi", 15000, 5000);
        SanPham sp3 = new SanPham("Không độ", 10000, 200);
        list.add(sp1);
        list.add(sp2);
        list.add(sp3);
        for(SanPham x : list){
            x.xuat();
        }
    }
    
}
