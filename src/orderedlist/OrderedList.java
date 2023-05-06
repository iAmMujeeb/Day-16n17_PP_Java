package orderedlist;

import java.util.Scanner;

public class OrderedList {
    public static void main(String[] args) {
        LinkedList<Integer> orderedList = new LinkedList<>();
        orderedList.append(10);
        orderedList.append(20);
        orderedList.append(30);
        orderedList.append(40);
        orderedList.append(50);
        orderedList.display();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to search");
        Integer num = scanner.nextInt();

        if(orderedList.search(num)!=null) {
            System.out.println("Number already present");
            orderedList.removeGiven(num);
        } else {
            orderedList.insertAfter(50,num);
        }
        orderedList.display();
    }
}
