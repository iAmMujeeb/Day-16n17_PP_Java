package ds.palindrome;

public class Palinrome {
    public static void main(String[] args) {
        Queue<Character> palindrome = new Queue<>();
        String str = "toot", reverseStr = "";
        int strLength = str.length();
        for(int i=0; i<strLength; i++){
            palindrome.enQueue(str.charAt(i));
        }
        palindrome.displayQueue();
        char ch = palindrome.deQueue();
        reverseStr = reverseStr + ch;
        char ch1 = palindrome.deQueue();
        reverseStr = reverseStr + ch1;
        char ch2 = palindrome.deQueue();
        reverseStr = reverseStr + ch2;
        char ch3 = str.charAt(0);
        reverseStr = reverseStr + ch3;
        System.out.println(reverseStr);

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
