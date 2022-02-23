package k14dhpm2.Game;

public class Player {
    private int number = 0;
    //interfaces
    public int getNumber(){
        return this.number;
    }
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }
    
}
