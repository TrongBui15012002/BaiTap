package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        Vehicle xe[] = null;
        int a = 0;
        Scanner n = new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("===============MENU===============");
            System.out.println("<<1: Nhập thông tin.");
            System.out.println("<<2: Xuất bảng kê khai tiền thuế.");
            System.out.println("<<3: Thoát.");
            System.out.print("- Nhập vào sự lựa chọ (1->3): ");
            luaChon = n.nextInt();
            switch(luaChon){
                case 1: 
                {
                    System.out.print("- Số lượng xe muốn nhập: ");
                    a = n.nextInt();
                    xe = new Vehicle[a];
                    for(int i = 0;i < a;i++){
                        xe[i] = new Vehicle();
                        xe[i].nhapThongTin();
                    }
                    break;
                }
                case 2: {
                    System.out.printf("%-25s %-25s %10s %10s %10s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế");
                    for(int i = 0;i < a;i++){
                        xe[i].setThue();;
                        xe[i].inThongTin();
                    }
                    break;
                }
                case 3: 
                    System.out.println("- KẾT THÚC!!!!");
                    return;
            }
            System.out.print("- Quay lại MENU (1:yes/0:no): ");
            luaChon = n.nextInt();
        }while(luaChon == 1);
    }
    
}
