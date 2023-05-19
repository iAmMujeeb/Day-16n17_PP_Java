package bankingcashcounter;


public class Queue<M> {

    public LinkedList<M> queue(){
        LinkedList<M> queue = new LinkedList();
        return queue;
    }

    public void enQueue(M item) {
        queue().append(item);
    }

    public void displayQueue() {
        queue().display();
    }

    public M deQueue() {
        return queue().popLast();
    }
}

