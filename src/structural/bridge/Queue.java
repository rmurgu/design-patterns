package structural.bridge;

public class Queue<T> implements FifoCollection<T> {

    LinkedList<T> linkedList;

    public Queue(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }

}
