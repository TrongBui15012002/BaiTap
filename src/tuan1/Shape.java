package tuan1;

public class Shape {
    String fileSound;
    public Shape(){

    }
    public void setFileSound(String fileSound){
        this.fileSound = fileSound;
    }

    public Shape(String fileSound){
        this.fileSound = fileSound;
    }

    public void rotate(){
        System.out.println("- Rotating 360 ...");
    }

    public void play(){
        System.out.println("Play file "+fileSound+" music");
        System.out.println("____________________________________");
    }
    
    
}
