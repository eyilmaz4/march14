package march14Codes;

public class duplicate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,5};
        avoidDuplicate(arr);
    }
    public static void avoidDuplicate(int[]arr){
       int [] newArr=new int [arr.length];
       int index=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    newArr[index]=arr[i];
                }
            }index++;
        }
        for(int num:newArr){
            System.out.print(num+"\t");
        }
    }
}
