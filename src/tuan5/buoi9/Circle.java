package tuan5.buoi9;

public class Circle extends Shape{
    private int radius;
    Circle(int _x, int _y, int _r) {
        super(_x, _y);
        radius = _r;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle at "+x+", "+y);
        
    }

    @Override
    public void erase() {
        System.out.println("Erase circle at "+x+", "+y);
        
    }
    
}
