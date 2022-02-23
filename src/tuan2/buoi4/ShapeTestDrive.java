package tuan2.buoi4;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square("Square.aif");
        Circle circle = new Circle("Circle.aif");
        Triangle triangle = new Triangle("Triangle.aif");
        Amoeba amoeba = new Amoeba("amoeba.hif", 5, 4);

        square.rotate();
        square.play();

        circle.rotate();
        circle.play();

        triangle.rotate();
        triangle.play();

        amoeba.rotate();
        amoeba.play();
    }
    
}
