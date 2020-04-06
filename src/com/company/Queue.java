package com.company;

public class Queue<E> {

    private E[] elements;
    private int index = 0;
    private int size;

    public Queue(int size) {
        elements = (E[]) new Object[size]; //its size because both index and size are integers
        this.size = size;
    }

    public void enqueue(E oneElement){
        elements[index] = oneElement;
        index++;
    }
    // The dequeue method identifies the first element and empties it.
    public void dequeue(){
        elements[index - size] = null;
    }

    //I made a display method for testing purposes
    public void display(){
        for(int i = 0; i<elements.length; i++){
            E returnElement = elements[index-1 - i];
            System.out.println(returnElement + " : " + (index-i) );
        }
    }
}
