package tuan3.buoi6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Red");
        car.setCarPrice(15000);
        System.out.println("- CarColor: "+car.getCarColor());
        System.out.println("- CarPrice: "+car.getCarPrice());
    }
    
}
