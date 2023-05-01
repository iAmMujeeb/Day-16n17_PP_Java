package ds.palindrome;

public class Queue<M> {
    LinkedList<M> primNumber = new LinkedList();

    public void enQueue(M item){
        primNumber.append(item);
    }

    public void displayQueue(){
        primNumber.display();
    }
    public M deQueue(){
        return primNumber.popLast();
    }
}
