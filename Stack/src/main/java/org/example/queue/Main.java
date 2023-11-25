package org.example.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("DeQueue : "+queue.deQueue());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        queue.enQueue(70);

        System.out.println("Size :"+queue.size());

        System.out.println("DeQueue : "+queue.deQueue());

        System.out.println("Size :"+queue.size());

        System.out.println("Peek :"+queue.peek());

        queue.printQueue();

        System.out.println("DeQueue : "+queue.deQueue());

        queue.printQueue();

        System.out.println("Size :"+queue.size());

        queue.clear();

        queue.printQueue();
    }
}
