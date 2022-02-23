package tuan3.buoi5;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(4);
        dog.setBreed("Lông xù");
        dog.setName("Kiki");

        System.out.println(("Size of dog: "+dog.getSize()));
        System.out.println("Breed of dog: "+dog.getBreed());
        System.out.println("Name of dog: "+dog.getName());
        
    }
    
}
