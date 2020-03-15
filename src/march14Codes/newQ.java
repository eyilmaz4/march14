package march14Codes;

public class newQ {
    public static void main(String[] args) {
        int[] arr = {106, 5, 15, 81, 26};
        int[] newArr = new int[arr.length];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    newArr[index] = arr[i];
                }
                index++;
            }
        }

            for (int num : newArr) {
                System.out.println(num);
            }
        }
    }

