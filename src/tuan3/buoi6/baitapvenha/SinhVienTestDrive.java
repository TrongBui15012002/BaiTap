package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien[] = null;
        Scanner nhap = new Scanner(System.in);
        System.out.print("- Nhập số lượng sinh viên muốn nhập thông tin: ");
        int a = nhap.nextInt();
        sinhVien = new SinhVien[a];
        for(int i = 0;i < a;i++){
            sinhVien[i] = new SinhVien();
            sinhVien[i].nhapThongTin();
        }
        //sắp xếp
        SinhVien tam = null;
        for(int i = 0;i < a - 1;i++){
            for(int j = i + 1;j < a;j++){
                if(sinhVien[i].getMssv() > sinhVien[j].getMssv()){
                    tam = sinhVien[i];
                    sinhVien[i] = sinhVien[j];
                    sinhVien[j] = tam;
                }
            }
        }
        //in
        System.out.println("DANH SÁCH SINH VIÊN \n");
        System.out.printf("%-20s%-20s%-20s%5s\n", "MSSV", "HVT", "DC", "SĐT");
        for(int i = 0;i < a;i++){
            System.out.println(sinhVien[i].toString());
        }

    }
    
}
