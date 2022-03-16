package tuan5.buoi9;

public class Cat extends Feline implements Pet{
    @Override
    protected void makeNoise() {
        System.out.println("- Meo meo....");
    }
    @Override
    protected void eat() {
        System.out.println("cá, cơm, hạt, ....");
    }
    public void chaseButterfly(){
        System.out.println("- Đuổi bướm....");
    }
    @Override
    public void beFriendly() {
        System.out.println("");
        
    }
    @Override
    public void play() {
        System.out.println("");
        
    }
    
}
