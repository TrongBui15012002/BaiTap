package tuan5.buoi10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import tuan3.buoi6.baitapvenha.HangThucPham;

public class WritingObject {
    public static void main(String[] args) throws IOException, ParseException {
        HangThucPham hangThucPham = new HangThucPham("123456", "bánh tráng", 50000, "15/01/2021", "15/01/2023");

        FileOutputStream outFile = new FileOutputStream("htp.dat");
        //chuyển đối tượng sang djang trung gian
         ObjectOutputStream objOut = new ObjectOutputStream(outFile);
        //tiến hành ghi
        objOut.writeObject(hangThucPham);
        objOut.close();
    }
    
}
