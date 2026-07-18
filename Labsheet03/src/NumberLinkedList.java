public class NumberLinkedList {

    public static void main(String[] args) {

        LinkedList numbers = new LinkedList();

        // ==========================
        // ข้อ 2
        // ==========================

        numbers.insert(0, 37);
        numbers.insert(0, 7);
        numbers.insert(0, 4);
        numbers.insert(0, 16);

        System.out.println("Exercise 2");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 3
        // ==========================

        numbers.insert(2, 20);

        System.out.println("Exercise 3");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 4
        // ==========================

        numbers.insert(25);

        System.out.println("Exercise 4");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 5
        // ==========================

        numbers.remove(0);

        System.out.println("Exercise 5");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 6
        // ==========================

        numbers.remove(2);

        System.out.println("Exercise 6");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 7
        // ==========================

        numbers.removeLastElement();

        System.out.println("Exercise 7");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 8
        // ==========================

        System.out.println("Exercise 8");
        System.out.println("Length = " + numbers.length());
        System.out.println();

        // ==========================
        // ข้อ 9
        // ==========================

        System.out.println("Exercise 9");
        System.out.println("Data at position 1 = " + numbers.get(1));
        System.out.println();

        // ==========================
        // ข้อ 10
        // ==========================

        numbers.set(1, 100);

        System.out.println("Exercise 10");
        System.out.println(numbers.traversal());
        System.out.println();

        // ==========================
        // ข้อ 11
        // ==========================

        numbers.clear();

        System.out.println("Exercise 11");
        System.out.println(numbers.traversal());

    }

}