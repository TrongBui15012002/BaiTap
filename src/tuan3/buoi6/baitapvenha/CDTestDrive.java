package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        CD cd[] = new CD[100];
        Scanner nhap = new Scanner(System.in);
        int luachon;
        int a = 0;
        do{
            System.out.println("============MENU============");
            System.out.println(">>1: Nhập CD.");
            System.out.println(">>2: Tính số lượng CD có trong danh sách.");
            System.out.println(">>3: Tính tổng giá thành của các CD.");
            System.out.println(">>4: Sắp xếp CD giảm dần theo giá thành.");
            System.out.println(">>5: In danh sách CD.");
            System.out.println(">>6: thoát.");
            System.out.print("- Nhập vào sự lựa chọn (1->6): ");
            luachon = nhap.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            switch(luachon){
                case 1:
                    System.out.println("----Nhập CD vào danh sách----");
                    System.out.print("- Nhập số CD muốn thêm: ");
                    a = nhap.nextInt();
                    if(a > 100){ 
                        System.out.println("- Dung lượng bộ nhớ k đủ.");
                    }else{
                        for(int i = 0;i < a;i++){
                            cd[i] = new CD();
                            cd[i].nhapCD();
                        }
                    }
                    break;
                case 2: 
                    System.out.println("----Tính số lượng CD có trong danh sách----");
                    int dem = 0;
                    for(int i = 0;i < a;i++){
                        if(cd[i] != null){
                            dem++;
                        }
                    }
                    System.out.println("- Số lượng CD có trong danh sách là: "+dem);
                    break;
                case 3:
                    System.out.println("----Tính tổng giá thành của các CD----");
                    double tong = 0;
                    for(int i = 0;i < a;i++){
                        if(cd[i] != null){
                            tong += cd[i].getGiaThanh();
                        }
                    }
                    System.out.println("- Tổng giá thànhcura các CD có trong danh sách là: "+tong);
                    break;
                case 4:
                    CD tam;
                    System.out.println("----Sắp xếp CD giảm dần theo giá thành----");
                    for(int i = 0;i < a - 1;i++){
                        for(int j = i+1;j < a;j++){
                            if(cd[i].getGiaThanh() < cd[j].getGiaThanh()){
                                tam = cd[i];
                                cd[i] = cd[j];
                                cd[j] = tam;
                            }
                        }
                    }
                    System.out.println("- Sắp xếp thành công");
                    break;
                case 5:
                    System.out.println("----In danh sách CD----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Mã CD", "Tựa CD", "Tên CS", "Số bài hát", "Giá thành");
                    for(int i = 0;i < a;i++){
                        System.out.println(cd[i].toString());
                    }
                    break;
                case 6: 
                    System.out.println("- KẾT THÚC.");
                    return;
                default: 
                    System.out.println("- Lựa chọn không hợp lệ!");
            }
            System.out.print("- Quay lại MENU (1:yes/0:no): ");
            luachon = nhap.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }while(luachon == 1);
    }
    
}
