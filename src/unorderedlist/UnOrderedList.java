package unorderedlist;

import java.util.Scanner;

public class UnOrderedList {

    public static void main(String[] args) {
        String paraGraph = "Read the Text and split it into words read and arrange it as Linked List again read and read";
        String[] strArray = paraGraph.split(" ");
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i=0; i<strArray.length; i++){
            linkedList.append(strArray[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to search");
        String str = scanner.next();

        linkedList.display();
        if(linkedList.search(str)!=null) {
            System.out.println("Word already present");
            linkedList.removeGiven(str);
            linkedList.removeGiven(str);
            linkedList.removeGiven(str);
        } else {
            linkedList.push(str);
        }

        linkedList.display();
    }

}
