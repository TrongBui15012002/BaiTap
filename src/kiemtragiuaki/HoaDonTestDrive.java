package kiemtragiuaki;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        List <HoaDonGio> dsGio = new ArrayList<>();
        List <HoaDonNgay> dsNgay = new ArrayList<>();
        int luachon;
        double thanhTien;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.println("======================MENU======================");
            System.out.println(">>1. Nhập danh sách hóa đơn thuê phòng theo giờ.");
            System.out.println(">>2. Nhập danh sách hóa đơn thuê phòng theo ngày.");
            System.out.println(">>3. Xuất danh sách hóa đơn thuê phòng theo giờ.");
            System.out.println(">>4: Xuất danh sách hóa đơn thuê phòng theo ngày.");
            System.out.println(">>5. Tổng số lượng từng loại phòng.");
            System.out.println(">>6: Tính trung bình thành tiền của hóa đơn thuê\n phòng trong tháng 9/2013.");
            System.out.println(">>7: Kết thúc.");
            System.out.print("- Nhập vào sự lựa chọn(1->7): ");
            luachon = nhap.nextInt();
            switch(luachon){
                case 1: 
                    System.out.println("----Nhập danh sách hóa đơn thuê phòng theo giờ----");
                    System.out.print("- Số lượng phòng muốn nhập là: ");
                    luachon = nhap.nextInt();
                    nhap.nextLine();
                    for(int i = 0;i < luachon;i++){
                        HoaDonGio hdg = new HoaDonGio();
                        hdg.nhapDS();
                        dsGio.add(hdg);
                    }
                    break;
                case 2: 
                    System.out.println("----Nhập danh sách hóa đơn thuê phòng theo ngày----");
                    System.out.print("- Số lượng phòng muốn nhập là: ");
                    luachon = nhap.nextInt();
                    nhap.nextLine();
                    for(int i = 0;i < luachon;i++){
                        HoaDonNgay hdn = new HoaDonNgay();
                        hdn.nhapDS();
                        dsNgay.add(hdn);
                    }
                    break;
                case 3:
                    System.out.println("----Xuất danh sách hóa đơn thuê phòng theo giờ----");
                    for (HoaDonGio x : dsGio) {
                        System.out.println("_________________________________________");
                        System.out.println(x);
                        if(x.getSoGio() > 24 && x.getSoGio() < 30){
                            thanhTien = 24*x.getDonGia();
                            System.out.println("+ Thành tiền: "+thanhTien);
                        }else{
                            thanhTien = x.getSoGio()*x.getDonGia();
                            System.out.println("+ Thành tiền: "+thanhTien);
                        }
                        if(x.getSoGio() >= 30){
                            System.out.println("+ Không tính theo hóa đơn giờ.");
                        }
                    }
                    break;
                case 4: 
                    System.out.println("----Xuất danh sách hóa đơn thuê phòng theo ngày----");
                    for (HoaDonNgay x : dsNgay) {
                        System.out.println("_________________________________________");
                        System.out.println(x);
                        if(x.getSoNgay() > 7){
                            thanhTien = 7*x.getDonGia()+ (x.getSoNgay() - 7)*x.getDonGia()*0.8;
                        }else{
                            thanhTien = x.getDonGia()*x.getSoNgay();
                        }
                        System.out.println("+ Thành tiền: "+thanhTien);
                    }
                    break;
                case 5: 
                    System.out.println("----Tổng số lượng từng loại phòng----");
                    int tong = 0;
                    for (HoaDon x : dsGio) {
                        tong++;
                    }
                    System.out.println("- Số phòng thuê theo giờ là: "+tong);
                    tong = 0;
                    for (HoaDon x : dsNgay) {
                        tong++;
                    }
                    System.out.println("- Số phòng thuê theo ngày là: "+tong);
                    break;
                case 6: 
                    System.out.println("----Tính trung bình thành tiền của hóa đơn thuê\n phòng trong tháng 9/2013----");
                    break;
                case 7:
                    System.out.println("- KẾT THÚC!");
                    return; 
                default: 
                    System.out.println("- Lựa chọn không hợp lệ!");       
            }
            System.out.print("- Quay lại MENU(1:yes/0:no): ");
            luachon = nhap.nextInt();
        }while(luachon == 1);
    }
    
}
