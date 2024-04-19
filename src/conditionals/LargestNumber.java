package conditionals;

public class LargestNumber {
    public static void main(String[] args) {
        // Write a Java program to find the largest of three numbers using if-else
        // statement.

        int a = 10, b = 20, c = 30;

        if (a >= b && a >= c) {
            System.out.println("A is higher!");
        } else if (b >= a && b >= c) {
            System.out.println("B is higher!");
        } else {
            System.out.println("C is higher!");
        }
    }
}
