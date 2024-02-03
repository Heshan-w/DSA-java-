public class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList linkedList = new LinkedList();

        // Append some nodes to the linked list
        linkedList.append(12);
        linkedList.append(222);
        linkedList.append(32);
        linkedList.append(43);
        linkedList.append(15);

        System.out.print("Linked List: ");
        linkedList.printList();
    }
}
