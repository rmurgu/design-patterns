package structural.bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> fifo = new Queue<>(new SinglyLinkedList<>());
        fifo.offer(13);
        fifo.offer(62);
        fifo.offer(2);

        System.out.println(fifo.poll());
        System.out.println(fifo.poll());
        System.out.println(fifo.poll());

        System.out.println(fifo.poll());
    }

}
