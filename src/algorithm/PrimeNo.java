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
        for (int i=0; i<arr.length; i++) {
            if (arr[i]!=0) {
                if ((arr[i] > 9) && (arr[i] < 99)) {
                    int temp = arr[i];
                    int rev = 0;
                    while (temp > 0) {
                        rev = rev * 10 + (temp % 10);
                        temp = temp / 10;
                    }
                    if (arr[i] == rev)
                        System.out.println(rev);
                }
                if (arr[i] > 99) {
                    int temp = arr[i];
                    int rev = 0;
                    while (temp > 0) {
                        rev = rev * 1000 + (temp % 1000);
                        temp = temp / 1000;
                    }
                    if (arr[i] == rev)
                        System.out.println(rev);

                }
            }
        }

    }
}