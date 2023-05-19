package bankingcashcounter;

public class Node<M> {
    M data;
    Node<M> next;

    public Node(M data){
        this.data = data;
    }
}
