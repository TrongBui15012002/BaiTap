package tuan5.BTTuan9.Bai2;

import java.text.ParseException;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) throws ParseException {
        SachGiaoKhoa sgk[] = new SachGiaoKhoa[100];
        SachThamKhao stk[] = new SachThamKhao[100];
        Scanner nhap = new Scanner(System.in);
        System.out.println("----SÁCH GIÁO KHAO----");
        System.out.print("- Nhập số sách giáo khoa: ");
        int a = nhap.nextInt();
        if(a < 100){
            for(int i = 0;i < a;i++){
                sgk[a] =  new SachGiaoKhoa();
                sgk[a].nhapSach();
            }
        }else{
            System.out.println("- Bộ nhớ không đủ để lưu sách.");
        }
        
    }
    
}
