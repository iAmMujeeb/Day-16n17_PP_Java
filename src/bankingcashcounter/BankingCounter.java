package bankingcashcounter;

import java.util.Scanner;

public class BankingCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you choice");
        System.out.println("1. Add People to queue to add money");
        System.out.println("2. Add People to queue to withdraw money");
        int n = scanner.nextInt();
        Queue queue = new Queue();
        if (n==1){
            queue.queue();
            System.out.println("Enter Amount to be added");
            int temp = scanner.nextInt();
            queue.enQueue(temp);
        }
        if (n==2){
            queue.queue();
            System.out.println("Enter Amount to be debited");
            int temp = scanner.nextInt();
            queue.enQueue(temp);
        }
        queue.displayQueue();
    }
}
