package march14Codes;
import java.util.Scanner;
public class selfishness {
    public static void main(String[] args) {
selfishnessLevel();
    }
    public static void selfishnessLevel(){
        Scanner x=new Scanner(System.in);
        String [] questions={"Q1:(0-10)?", "Q2:(0-10)?", "Q3:(0-10)?", "Q4:(0-10)?"};
        int sum=0;
        int [] answers=new int [questions.length];
     for(int i=0; i<questions.length; i++){
         System.out.println(questions[i]);
         answers[i]=x.nextInt();
             sum+=answers[i];
     }
     if(sum<=10){
         System.out.println("not selfish");

     }
     else if(sum>11 && sum<=30){
         System.out.println("selfish");
     }
     else if(sum>30){
         System.out.println("super selfish");
     }
     else{
         System.out.println("undefined");
     }
        System.out.println("your answers:");
        for(int num:answers){
            System.out.print(num+"\t");
        }
    }

}
