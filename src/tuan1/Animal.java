package tuan1;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    protected  void makeNoise(){
        System.out.print("kêu ...");

    }
    protected void eat(){
        System.out.println("Ăn ...");
    }
    protected void sleep(){
        System.out.println("- Sleeping...");

    }
    protected void roam(){
        System.out.println("Roaming...");

    }
    
}
