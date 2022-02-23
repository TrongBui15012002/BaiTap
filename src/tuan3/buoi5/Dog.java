package tuan3.buoi5;

public class Dog {
    //stribute
    private int size;
    private String breed;
    private String name;
    //method
    //setter/getter/public interfaces
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("- Size không hợp lệ!!!");

        }
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
         return this.name;
    }

    
}
