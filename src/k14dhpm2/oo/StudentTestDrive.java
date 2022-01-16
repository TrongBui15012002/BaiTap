package k14dhpm2.oo;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student taiStudent = new Student();
        Student thachStudent = new Student();
        Student trungStudent = new Student();

        taiStudent.student("Thành Tài", 19, "014", "K14DCPM02");
        taiStudent.in();
        taiStudent.hoatDongNgoaiKhoa();

        thachStudent.student("thạch", 19, "288", "K14DCPM02");
        thachStudent.in();
        thachStudent.doc();

        trungStudent.student("Quang Trung", 19, "026", "K14DCPM02");
        trungStudent.in();
        trungStudent.thi();

    }
    
}
