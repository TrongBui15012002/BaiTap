package tuan1;

public class Lion extends Animal{
    @Override//ghi đè
    protected void eat() {
        System.out.println("- Lion Eating meat, fish, ...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("- Lion sound ...");
    }
    
    
}
