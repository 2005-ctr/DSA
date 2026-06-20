/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_3;

/**
 *
 * @author Ramindi
 */
public class CircularDoublyLinkedList {
    private static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.previous = head;
            return;
        }

        Node tail = head.previous;
        tail.next = newNode;
        newNode.previous = tail;
        newNode.next = head;
        head.previous = newNode;
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            if (current.data == value) {
                if (current.next == current) {
                    head = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                    if (current == head) {
                        head = current.next;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.delete(20);
        list.display();
    }

}
