public class TestLinkedNode {

    public static void main(String[] args) {

        

        node node1 = new node("Alice");
        node node2 = new node(25);
        node node3 = new node(true);
        node node4 = new node(17.5);

        

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        

        System.out.println("Node 1");
        System.out.println("Data = " + node1.data);
        System.out.println("Address = " + node.getAddress(node1));
        System.out.println("Pointer Address = " + node.getAddress(node1.next));

        System.out.println();

        

        System.out.println("Node 2");
        System.out.println("Data = " + node2.data);
        System.out.println("Address = " + node.getAddress(node2));
        System.out.println("Pointer Address = " + node.getAddress(node2.next));

        System.out.println();

        

        System.out.println("Node 3");
        System.out.println("Data = " + node3.data);
        System.out.println("Address = " + node.getAddress(node3));
        System.out.println("Pointer Address = " + node.getAddress(node3.next));

        System.out.println();

        

        System.out.println("Node 4");
        System.out.println("Data = " + node4.data);
        System.out.println("Address = " + node.getAddress(node4));
        System.out.println("Pointer Address = " + node.getAddress(node4.next));

    }

}