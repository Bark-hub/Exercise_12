package com.company;

public class Main {

    public static void main(String[] args) {

        Queue<String> testingQueue = new Queue<>(3);

        testingQueue.enqueue("sue");   
        testingQueue.enqueue("bob");
        testingQueue.enqueue("sall");
        testingQueue.display();

        System.out.println("------------After Dequeue---------");
        testingQueue.dequeue();
        testingQueue.display();
    }
}
