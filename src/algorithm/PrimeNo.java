package algorithm;

public class PrimeNo {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        int j=0;
        for (int i = 0; i <= 1000; i++) {
            if ((i == 0) || (i == 1))
                System.out.println("Not Prime Number");
            else if ((i == 2) || (i == 3) || (i == 5) || (i == 7))
                arr[j] = i;
            else if ((i % i == 0) && (i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                arr[j] = i;
            }
           j++;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0)
            System.out.println(arr[i]);
        }
    }
}