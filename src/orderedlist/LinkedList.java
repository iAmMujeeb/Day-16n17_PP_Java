package orderedlist;


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

    public Node<M> search(M searchData) {
        Node<M> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean removeGiven(M removeData) {
        Node<M> searchedNode = search(removeData);
        if (searchedNode != null) {
            Node<M> temp = searchedNode;
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

    public boolean insertAfter(M searchData, M insertData) {
        Node<M> insertNode = new Node<>(insertData);
        Node<M> searchedNode = search(searchData);
        if (searchedNode != null) {
            Node<M> temp = searchedNode.next;
            searchedNode.next = insertNode;
            insertNode.next = temp;
            return true;
        }
        return false;
    }

    public void display(){
        Node<M> temp = head;
        while ((temp != null)&&(temp.data!=null)) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
