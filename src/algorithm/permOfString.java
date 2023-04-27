package algorithm;

public class permOfString {

    public static void allPermutation(String str, int a, int b) {
        if (a == b)
            System.out.println(str);
        else {
            for (int i = a; i <= b; i++) {
                str = swap(str, a, i);
                allPermutation(str, a + 1, b);
                str = swap(str, a, i);
            }
        }
    }

    public static String swap(String ch, int i, int j) {
        char temp;
        char[] charArray = ch.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int l = str.length();
        permOfString.allPermutation(str, 0, l - 1);
    }
}
