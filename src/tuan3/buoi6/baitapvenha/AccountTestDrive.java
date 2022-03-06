package tuan3.buoi6.baitapvenha;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account bank[] = null;
        int luachon;
        int a = 0;
        long stk;
        Scanner nhap = new Scanner(System.in);
        double tien;
        do{
            System.out.println("============NENU============");
            System.out.println(">>1: Nhập thông tin tài khoản.");
            System.out.println(">>2: Nạp tiền.");
            System.out.println(">>3: Rút tiền.");
            System.out.println(">>4: Đáo hạn.");
            System.out.println(">>5: Chuyển khoản.");
            System.out.println(">>6: In thông tin tài khoản.");
            System.out.println(">>7: Thoát.");
            System.out.print("- Nhập vào sự lựa chọn (1->7): ");
            luachon = nhap.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            switch(luachon){
                case 1: 
                    System.out.println("---Nhập thông tin tài khoản---");
                    System.out.print("- Số lượng tài khoản muốn nhập thông tin là: ");
                    a = nhap.nextInt();
                    bank = new Account[a];
                    for(int i = 0;i < a;i++){
                        System.out.println("- Nhập thông tin tài khoản thứ: "+ (i+1));
                        bank[i] = new Account();
                        bank[i].nhapThongTin();
                    }
                    break;

                case 2: 
                    System.out.println("---Nạp tiền vào tài khoản---");
                    System.out.print("- Nhập vào số tài khoản muốn nạp tiền: ");
                    stk = nhap.nextLong();
                    for(int i = 0;i < a;i++){
                        if(bank[i].getSoTK() == stk){
                            System.out.print("- Nhập số tiền cần nạp: ");
                            tien = nhap.nextDouble();
                            bank[i].napTien(tien);
                            System.out.println("--> Nạp tiền thành công<--");
                        }
                    }
                    break;
                case 3: 
                    System.out.println("---Rút tiền trong tài khoản---");
                    System.out.print("- Nhập số tài khoản muốn rút tiền: ");
                    stk = nhap.nextLong();
                    for(int i = 0;i < a;i++){
                        if(bank[i].getSoTK() == stk){
                            System.out.print("- Nhập số tiền cần rút: ");
                            tien = nhap.nextDouble();
                            bank[i].napTien(tien);
                            System.out.println("--> Rút tiền thành công<--");
                            break;
                        }
                    }
                    break;
                case 4: 
                    System.out.println("---Đáo hạn ngân hàng---");
                    System.out.print("- Nhập số tài khoản muốn đáo hạn: ");
                    stk = nhap.nextLong();
                    for(int i = 0;i < a;i++){
                        if(bank[i].getSoTK() == stk){
                            bank[i].daoHan();
                            System.out.println("-->Đáo hạn thành công<--");
                        }
                    }
                    break;
                case 5:
                    System.out.println("---Chuyển tiền đến tài khoản khác---");
                    System.out.print("- Nhập số tài khoản muốn chuyển tiền: ");
                    stk = nhap.nextLong();
                    for(int i = 0;i < a;i++){
                        if(bank[i].getSoTK() == stk){
                            System.out.print("- Nhập số tài khoản nhận tiền: ");
                            stk = nhap.nextLong();
                            System.out.print("- Nhập số tiền cần chuyển: ");
                            tien = nhap.nextDouble();
                            bank[i].chuyenTien(tien);
                            System.out.println("-->Chuyển thành công<--");
                        }
                    }
                    break;
                case 6:
                    System.out.println("---In thông tin tài khoản---");
                    for(int i = 0;i < a;i++){
                        bank[i].toString();
                        System.out.println("____________________________________");
                    }
                    break;
                case 7:
                    System.out.println("- Kết thúc!!!");
                    return;
            }
            System.out.print("- Quay lại MENU (1:yes/0:no): ");
            luachon = nhap.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }while(luachon == 1);
    }
    
}
