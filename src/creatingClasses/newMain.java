package creatingClasses;

public class newMain {
    public static void main(String[] args) {
        System.out.println("Java is fun from main");
        newMain.main("it is fun");
    }
    public static void main(String arg1){
        System.out.println("yes"+arg1);
        newMain.main("it is fun","indeed");
    }
    public static void main(String arg1, String arg2){
        System.out.println("Right,"+arg1+","+arg2);
    }
}
