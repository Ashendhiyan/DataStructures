package org.example.stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.pop();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println("peek: "+peek);

        System.out.println("---------------------------");

        stack.push(40);
        System.out.println("peek: "+stack.peek());

        stack.push(50);
        System.out.println("peek: "+stack.peek());

        System.out.println("---------------------------");

        System.out.println("Pop :"+stack.pop());
        System.out.println("Pop :"+stack.pop());

        System.out.println("---------------------------");

        stack.printStack(); //[10,20,30]

        stack.push(400);
        stack.printStack(); //[10 ,20 ,30 ,400]

        stack.push(500);    // Stack is full
        stack.printStack();

        stack.push(600);     // Stack is full
        stack.printStack();

        System.out.println("---------------------------");

        System.out.println("Size :"+stack.size());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Size :"+stack.size());

    }
}