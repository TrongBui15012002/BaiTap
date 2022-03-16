package tuan5.buoi9;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Lion();

        animal.makeNoise();
        animal.eat();
        
        animal2.makeNoise();
        animal2.eat();

        animal3.makeNoise();
        animal3.eat();
    }
    
}
