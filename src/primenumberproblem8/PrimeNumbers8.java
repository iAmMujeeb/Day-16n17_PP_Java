package primenumberproblem8;

import java.util.Arrays;

public class PrimeNumbers8 {
    public static void main(String[] args) {
        int[][] primeNo = new int[11][1001];
        int k = 0;
        int l = 0;
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i <= 100; i++) {
                if ((l == 0) || (l == 1)) {
                }else if ((l == 2) || (l == 3) || (l == 5) || (l == 7))
                    primeNo[k][l] = l;
                else if ((l % l == 0) && (l % 2 != 0) && (l % 3 != 0) && (l % 5 != 0) && (l % 7 != 0)) {
                    primeNo[k][l] = l;
                }
                l++;
                if(l>1000)
                    break;
            }
            if(l>1000)
                break;
            k++;
        }
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i <= 1000; i++) {
                if (primeNo[j][i]!=0)
                System.out.print(primeNo[j][i]+" ");
            }
            System.out.println();
        }
    }
}
