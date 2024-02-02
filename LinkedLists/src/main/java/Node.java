public class Node {
    // data filed is for storing the data(int datatype in this case)
    int data;
    // next field is for storing the reference to the next node
    Node next;

    // Constructor to initialize the data and next fields
    public Node(int data) {
        // initialize the data field with the given data
        this.data = data;
        // initialize the next field with null
        this.next = null;
    }
}