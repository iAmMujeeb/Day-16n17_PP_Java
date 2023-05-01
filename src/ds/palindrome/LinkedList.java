package ds.palindrome;

public class LinkedList<M> {
    Node<M> head;
    Node<M> tail;

    public void append(M data) {
        Node<M> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public M popLast() {
        M popData = tail.data;
        Node<M> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public M pop(){
        M popElement = head.data;
        head = head.next;
        return popElement;
    }

    public void display() {
        Node<M> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
