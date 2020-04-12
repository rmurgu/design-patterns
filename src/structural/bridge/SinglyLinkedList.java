package structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private int size;
    private Node first;
    private Node last;

    @Override
    public void addFirst(T element) {
        if (first == null) {
            last = first = new Node(element, null);
        } else {
            first = new Node(element, first);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        T temp = (T) first.data;
        if (first.next != null) {
            first = first.next;
        } else {
            first = null;
            last = null;
        }
        size--;
        return temp;
    }

    @Override
    public void addLast(T element) {
        if (last == null) {
            last = first = new Node(element, null);
        } else {
            last.next = new Node(element, null);
            last = last.next;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        Node before = first;
        Node toRemove = last;
        for (int i = 0; i < size - 2; i++) {
            before = before.next;
        }
        before.next = null;
        last = before;
        size--;
        return (T) toRemove.data;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}





