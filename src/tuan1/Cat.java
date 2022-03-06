package tuan1;

public class Cat extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("- Meo meo....");
    }
    public void chaseButterfly(){
        System.out.println("- Chasing....");
    }
    
}
