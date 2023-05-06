package unorderedlist;

public class LinkedList<T> {

    Node<T> head;

    Node<T> tail;


    public void push(T data) {
        Node<T> newNode = new Node(data); // data, next
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while ((temp != null)&&(temp.data!=null)) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(T data) {
        Node<T> newNode = new Node(data); // data, next = null
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public T pop() {
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast() {
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }


    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean removeGiven(T removeData) {
        Node<T> searchedNode = search(removeData);
        if (searchedNode != null) {
            Node<T> temp = searchedNode;
            if (temp.next!= null) {
                searchedNode.data = temp.next.data;
                searchedNode.next = temp.next.next;
                return true;
            }if(temp.next == null){
                searchedNode.data = null;
                searchedNode.next = null;
            }

        }
        return false;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> insertNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            Node<T> temp = searchedNode.next;
            searchedNode.data = insertNode.data;
            searchedNode.next = temp.next;
            return true;
        }
        return false;
    }
}
