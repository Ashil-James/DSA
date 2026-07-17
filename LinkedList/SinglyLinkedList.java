package DSA.LinkedList;
import java.util.*;

public class SinglyLinkedList {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Insert at beginning
    public static Node insertFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    //Insert at end
    public static Node insertLast(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    //Insert at Position
    public static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if(position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    //Delete First
    public static Node deleteFirst(Node head) {
        if(head == null){
            return null;
        }

        return head.next;
    }

    //Delete Last
    public static Node deleteLast(Node head){
        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        
        return head;
    }

    //Delete at a position (0-based indexing)
    public static Node deleteAtPosition(Node head, int position) {
        if(head == null) {
            return null;
        }

        if(position == 0){
            return head.next;
        }

        Node temp = head;

        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    //Display the linkedList
    public static void display(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("->");
            }

            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertFirst(head, 30);
        head = insertFirst(head, 20);
        head = insertFirst(head, 10);

        System.out.println("After insertFirst:");
        display(head);

        head = insertLast(head, 40);
        head = insertLast(head, 50);

        System.out.println("\nAfter insertLast:");
        display(head);

        head = insertAtPosition(head, 25, 2);

        System.out.println("\nAfter insertAtPosition (25 at index 2):");
        display(head);

        head = deleteFirst(head);

        System.out.println("\nAfter deleteFirst:");
        display(head);

        head = deleteLast(head);

        System.out.println("\nAfter deleteLast:");
        display(head);

        head = deleteAtPosition(head, 2);

        System.out.println("\nAfter deleteAtPosition (index 2):");
        display(head);
    }

}