// a linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
// the elements in a linked list are linked using pointers.
// each element in a linked list is called a node.
// a node consists of two fields: data and next.
// data field is for storing the data.
// next field is for storing the reference to the next node.
// the first node is called the head.
// the last node is the tail.
// the last node points to null.
// a linked list can be singly linked or doubly linked.
// in a singly linked list, each node points to the next node.
// in a doubly linked list, each node points to the next node and the previous node.
// a linked list can be used to implement a stack, queue, and other data structures.

// the below code is an example of a singly linked list.
public class LinkedList {
    // Node class to create nodes of the linked list
    Node head;

    // Constructor to initialize the head of the linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        // If the linked list is empty, then make the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }
        // Else, traverse the linked list to find the last node
        Node last = head;
        while (last.next != null) {
            // Move to the next node
            last = last.next;
        }

        // Make the new node as the next node of the last node
        last.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        // Initialize the current node with the head
        Node current = head;
        // Traverse the linked list and print the data of each node
        while (current != null) {
            // Print the data of the current node
            System.out.print(current.data + " ");
            // Move to the next node
            current = current.next;
        }
        // Print a new line after printing the linked list
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a new linked list
        LinkedList linkedList = new LinkedList();

        // Append some nodes to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        System.out.print("Linked List: ");
        linkedList.printList();
    }
}