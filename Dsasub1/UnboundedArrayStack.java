/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsasub1;

/**
 *
 * @author Ramindi
 */
public class UnboundedArrayStack {
    private int[] data;
    private int top;

    public UnboundedArrayStack() {
        data = new int[2];
        top = -1;
    }

    public void push(int value) {
        if (top == data.length - 1) {
            resize(data.length * 2);
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int value = data[top--];

        if (data.length > 2 && size() <= data.length / 4) {
            resize(data.length / 2);
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newSize) {
        int[] newData = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
