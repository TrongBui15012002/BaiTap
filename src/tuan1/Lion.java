package tuan1;

public class Lion extends Feline{
    @Override//ghi đè
    protected void eat() {
        System.out.println("- Lion Eating meat, fish, ...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("- Lion sound: ");
    }
    
    
}
