package tuan1;

public class Tiger extends Feline{
    @Override
    protected void makeNoise() {
        System.out.println("Tiger sound...");
    }
    @Override
    protected void eat() {
        System.out.println("tiger eating....");
    }
}
