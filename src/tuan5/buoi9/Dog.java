package tuan5.buoi9;

public class Dog extends Canine implements Pet, IntName{
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

    @Override
    public void beFriendly() {
        System.out.println(" ");
        
    }

    @Override
    public void play() {
        System.out.println();
        
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

}
