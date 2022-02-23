package tuan3.buoi5;

public class IntSquare {
    //implementation
    private int squareValue;
    //interfaces
    public int getSquare(int value){
        this.squareValue = this.calcalateSquare(value);
        return this.squareValue;
    }
    private int calcalateSquare(int value){
        return (int)Math.pow(value, 2);
    }


    
}
