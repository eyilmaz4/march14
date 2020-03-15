package creatingClasses;

public class CarTest {
    public static void main(String[] args) {
        Car myCar=new Car(2020, "Honda","yellow");
        System.out.println(myCar.modelYear+" "+myCar.modelName+" "+myCar.modelColor);
    }
}
