package march14Codes;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,6,6};
        int[] arr2 = {3, 4, 5, 1,6};
        inter(arr1, arr2);
    }

    public static void inter(int[] arr1, int[] arr2) {
        int index = 0;
        System.out.println("intersection elements are:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+"\t");
                    index++;
                }
                       }
        }
    }
}
