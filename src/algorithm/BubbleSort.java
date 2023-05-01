package algorithm;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr1 = {6, 3, 0, 5};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;

                }
            }
        }
        for (int i = 0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}


