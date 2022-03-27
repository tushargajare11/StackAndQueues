package com.bridgelabz.stack_and_queue;

public class StackAndQueueMain {
    public static void main(String args[]) {
        System.out.println("Welcome To Stack and Queue Problem");

        System.out.println("\n===================");

        System.out.println("Create Stack");
        StackOperation.addElement();
        System.out.println("\n===================");

        System.out.println("Top element in stack");
        StackOperation.peek();
        System.out.println("\n===================");

        System.out.println("Delete last element from stack");
        StackOperation.pop();
        System.out.println("\n===================");

        System.out.println("Create Queue");
        StackOperation.queueElement();
        System.out.println("\n===================");

        System.out.println("Dequeue Elements");
        StackOperation.dequeueElement();
        System.out.println("\n===================");
    }
}
