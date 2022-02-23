package tuan2.buoi4;

public class Square {
    String fileSound;

    public Square(String fileSound){
        this.fileSound = fileSound;
    }

    void rotate(){
        System.out.println("- Rotating 360 ...");
    }

    void play(){
        System.out.println("Play file "+fileSound+" music");
        System.out.println("____________________________________");
    }
    
}
