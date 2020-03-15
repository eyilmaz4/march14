package creatingClasses;
import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        convertion(true, 2.0);
    }
    public static void convertion(boolean inch, double input){
      Scanner x= new Scanner(System.in);
        System.out.println("do you have inch value? true/false");
        boolean number=x.nextBoolean();
     double newValue;
        if(number){
            newValue= input/2.5;
        }
        else {
            newValue=input*2.5;
        }
        System.out.println("answer:"+newValue);
    }
}
