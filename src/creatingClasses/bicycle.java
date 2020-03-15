package creatingClasses;

public class bicycle {
    String colorOfBike;
    String sizeOfBike;
    public bicycle(String color, String size){
       colorOfBike=color;
        sizeOfBike=size;
    }
    public  void goFast(){
        System.out.println("go fast");
    }
    public  void goFaster(String level){
        System.out.println("go faster in"+" "+level+""+"level");
    }
    public  void goSlowly(){
        System.out.println("go slowly");
    }
    public  void slowDown(){
        System.out.println("slow down");
    }
}
