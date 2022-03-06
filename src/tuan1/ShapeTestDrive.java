package tuan1;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setFileSound("circle.aif");
        circle.rotate();
        circle.play();

        System.out.println("- Testing Amoeba ...");
        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setFileSound("amoebaMusic.hif");
        amoeba.rotate();
        amoeba.play();

    }
    
}
