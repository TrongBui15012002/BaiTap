package k14dhpm2.buoi4;

public class Amoeba {
    String fileSound;
    double xPoint;
    double yPoint;

    public Amoeba(String fileSound){
        this.fileSound = fileSound;
    }
    public Amoeba(String fileSound, double xPoid, double yPoid){
        this(fileSound);
        this.xPoint = xPoid;
        this.yPoint = yPoid;
    }

    void rotate(){
        System.out.println("- Rotating 360 ... at xPoid: "+xPoint+" yPoid: "+yPoint);
    }

    void play(){
        System.out.println("Play file "+fileSound+" music");
        System.out.println("____________________________________");
    }
    
}
