package k14dhpm2.buoi4;

public class Triangle {
    String fileSound;

    public Triangle(String fileSound){
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
