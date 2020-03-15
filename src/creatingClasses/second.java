package creatingClasses;

import org.w3c.dom.ls.LSOutput;

public class second {
    public static void main(String[] args) {
printString();
printString("java");
printString(20,"java");
    }
    public static void printString() {
        for (int i = 0; i <= 100; i++) {
            System.out.print("hello world"+"\t");
        }
        System.out.println();
    }

    public static void printString(String word){
        for(int i=0; i<=100; i++){
            System.out.print(word);
        }
        System.out.println();
    }
    public static void printString(int value, String word){
        for(int i=0; i<=value; i++){
            System.out.print(word);
        }
        System.out.println();
    }
}
