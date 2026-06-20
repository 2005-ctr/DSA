/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsasub1;

import java.util.Stack;
/**
 *
 * @author Ramindi
 */
public class StackQueueEnqueueFriendly {
    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public void enqueue(int value) {
        input.push(value);
    }

    public int dequeue() {
        if (input.isEmpty() && output.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
