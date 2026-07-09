import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab202 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        
        for (int num : initial_numbers) {
            numbers.add(num);
        }

        System.out.println(" initial_numbers = " + numbers);

        
        System.out.print("INSERT  LAST NUMBER: ");
        int addLast = sc.nextInt();
        numbers.add(addLast);

        
        int insertIndex = 8;   
        int removeIndex = 1;   
        int updateIndex = 2;   

        
        System.out.print("INSERT LAST NUMBER AGAIN: ");
        int insertValue = sc.nextInt();
        numbers.add(insertIndex, insertValue);

        
        numbers.remove(removeIndex);

        
        numbers.set(updateIndex, 9);

        
        System.out.println("ArrayList = " + numbers);

        sc.close();
    }
}