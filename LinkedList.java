import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(java.util.Arrays.asList(2, 4, 3));
        LinkedList<Integer> l2 = new LinkedList<>(java.util.Arrays.asList(5, 6, 4));
        LinkedList<Integer> l3 = new LinkedList<>();
    
        // Convert LinkedList l1 to integer n1
        int n1 = 0;
        for (int value : l1) {
            n1 = n1 * 10 + value;
        }

        // Convert LinkedList l2 to integer n2
        int n2 = 0;
        for (int value : l2) {
            n2 = n2 * 10 + value;
        }

        // Sum the two numbers
        int n3 = n1 + n2;

        // Extract digits from n3 and store them in LinkedList l3
        while (n3 > 0) {
            int digit = n3 % 10; // Get the last digit
            l3.addLast(digit); // Add the digit to the beginning of l3
            n3=n3/ 10;           // Remove the last digit from n3
        }

        // Output the final results
        System.out.println("The sum as an integer: " + (n1 + n2));
        System.out.println("The sum as a LinkedList: " + l3);
    }
}
