package org.example.queue;

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;

    public Queue(int initialCapacity){
        elementData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data){
        if (isFull()){
            grow();
//            System.out.println("Queue is full..!");
//            return;
        }
        if (front== -1){
            front = 0;
        }
        elementData[++rear] = data;
    }

    public int deQueue(){
        if (isEmpty()){
            System.err.println("Queue is empty..!");
            return -1;
        }
        return elementData[front++];
    }

    public int peek(){  // first
        return elementData[front];
    }

    public void printQueue(){
        if (isEmpty()){
            System.err.println("Queue is Empty");
            return;
        }
        System.out.print("[");
        for (int i = front;i<=rear;i++){
            System.out.print(elementData[i]+" ,");
        }
        System.out.println("\b\b]");
    }

    public int size(){
        return rear-front+1;
    }

    public boolean isEmpty(){
        return front== -1;
    }

    public boolean isFull(){
        return rear== elementData.length -1 || front > rear;
    }

    public void grow(){
        int[] temp = elementData; // length 5
        elementData = new int[elementData.length * 2];
        for (int i=0;i<temp.length;i++){
            elementData[i] =temp[i];
        }
    }

    public void clear(){
        front = -1;
        rear = -1;
    }
}
