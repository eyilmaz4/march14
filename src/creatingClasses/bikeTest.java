package creatingClasses;

public class bikeTest {
    public static void main(String[] args) {
        bicycle myBike= new bicycle("blue", "small");
        System.out.println("color:"+myBike.colorOfBike+" "+"size:"+myBike.sizeOfBike);
       myBike.goFast();
       myBike.goFaster("4");
       myBike.goSlowly();
       myBike.slowDown();
bicycle myBlueBike=new bicycle("blue", "large");
        System.out.println(myBlueBike.colorOfBike);
    }
}
