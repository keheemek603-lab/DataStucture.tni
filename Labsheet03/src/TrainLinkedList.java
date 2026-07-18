public class TrainLinkedList {

    public static void main(String[] args) {

        
        LinkedList greenline = new LinkedList();

       
        greenline.insert("Mo-chit");

        
        greenline.insert("Ari");

        
        greenline.insert("Sanam-Pao");

        
        System.out.println("Current Station = " + greenline.traversal());

        
        greenline.insert(2, "Rachakru");

        
        System.out.println("Current Station = " + greenline.traversal());

        
        System.out.println("Number of Station = " + greenline.length());

        
        System.out.println("First Station = " + greenline.get(0));

        
        greenline.set(0, "Mo-chit (Central Ladprao)");

        
        System.out.println("Current Station = " + greenline.traversal());

        
        greenline.remove(2);

        
        System.out.println("Current Station = " + greenline.traversal());

        
        greenline.removeLastElement();

        
        System.out.println("Current Station = " + greenline.traversal());

        
        greenline.clear();

        
        System.out.println("Number of Station = " + greenline.length());

        
        System.out.println("Current Station = " + greenline.traversal());

    }

}