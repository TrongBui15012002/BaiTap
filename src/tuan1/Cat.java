package tuan1;

public class Cat extends Feline{
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
    
}
