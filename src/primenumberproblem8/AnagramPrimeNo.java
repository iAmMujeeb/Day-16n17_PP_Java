package primenumberproblem8;

public class AnagramPrimeNo {
    public static void main(String[] args) {
        int [] temp = new int[231];
        int [][] anagramPrimeNo = new int[11][101];
        int l = 0;
        for (int i = 0; i <= 1000; i++) {
            if ((i == 0) || (i == 1))
                System.out.println("Not Prime Number");
            else if ((i == 2) || (i == 3) || (i == 5) || (i == 7)) {
                temp[l] = i;
                l++;
            }else if ((i % i == 0) && (i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                temp[l]=i;
                l++;
            }
        }
        for (int i = 0; i <= 230; i++){
            for (int j = i+1; j <= 230; j++)
            System.out.println(temp[i]);
        }

    }
}
