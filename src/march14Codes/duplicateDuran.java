package march14Codes;

import java.util.Arrays;

public class duplicateDuran {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }
    public static boolean isItInArray(int value, int [] arr){
        boolean result=false;
        for(int number:arr){
            if(number==value){
                result=true;
            }
        }
        return  result;
    }
    public static int[] removeDuplicates(int[]arr){
        int[]removedDup=new int [arr.length];
        int index=0;
        for(int element:arr){
            if(isItInArray(element,removedDup)){
                removedDup[index]=element;
                index++;
            }
        }
        return removedDup;
    }
}
