package tuan1;

public class Amoeba {
    String fileSound;
    double xPoint, yPoint;
    public Amoeba(){

    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    public Amoeba(String fileSound, double xPoint, double yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public Amoeba(String fileSound){
        this.fileSound = fileSound;
    }

    void rotate(){
        System.out.println("- Rotating 360 tại xPoint");
    }

    void play(){
        System.out.println("Play file "+fileSound+" music");
        System.out.println("____________________________________");
    }
    
}
