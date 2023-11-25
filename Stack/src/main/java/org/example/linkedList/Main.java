package org.example.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnding(400);

        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(30);


        linkedList.insertAtEnding(40);

        linkedList.traverse();  // print list

        linkedList.insertAtPosition(50,2);

        linkedList.traverse(); // [30 ,20 ,50 ,10 ,400 ,40]

        linkedList.deleteAtBeginning();

        linkedList.traverse();  //[20 ,50 ,10 ,400 ,40]

        linkedList.deleteAtEnding();

        linkedList.traverse();  //[20 ,50 ,10 ,400]

        linkedList.deleteAtPosition(2);

        linkedList.traverse();  //[20 ,50 ,400]

        System.out.println("Size : "+linkedList.size());

        System.out.println("Get : "+linkedList.get(2));
    }
}
