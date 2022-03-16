package tuan1;

public class Dog extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("- Gâu gâu...");
    }

    @Override
    protected void eat() {
        System.out.println("cơm, xương, ....");
    }

    void chaseCat() {
        System.out.println("- Đuổi mèo......");
    }

}
