/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_2;

import java.util.Stack;

/**
 *
 * @author Ramindi
 */
public class StackQueueDequeueFriendly {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> tempStack = new Stack<>();

    public void enqueue(int value) {
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }

        mainStack.push(value);

        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public int dequeue() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return mainStack.pop();
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
