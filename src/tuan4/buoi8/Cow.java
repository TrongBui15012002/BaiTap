package tuan4.buoi8;

public class Cow extends Animal{
    double giveMilk;

    public Cow(){
        giveMilk = 500;
    }

    public Cow(double giveMilk, String name){
        super(name);
        this.giveMilk = giveMilk;  
    }
    @Override
    public String toString() {
        return "Cow [giveMilk = "+giveMilk+"]"+super.toString();
    }
    
}
