package creatingClasses;

public class convert_Duran {

        public static void main(String[] args) {
            System.out.println(convertLength(10));
            System.out.println(convertLength(10.0));
        }
        public static double convertLength(int cm){
            return cm*2.54;
        }
        public static double convertLength(double inch){
            return inch/2.54;
        }
    }
