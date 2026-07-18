
public class node {
Object data; // Data of the node
node next; // Pointer to the next node in the list
public node (Object data) { // Constructor to initialize the node with data
this.data = data;
this.next = null;
}
public String getAddress() {
return "" + Integer.toHexString(System.identityHashCode(this));
}
// Method for returning the pointer address of node
public static String getAddress(node node) {
return (node == null) ? "null" : node.getAddress();
}
}