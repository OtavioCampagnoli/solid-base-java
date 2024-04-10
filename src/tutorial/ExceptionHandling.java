package tutorial;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int interator;

        try {

            System.out.println("Digit the lenght of Queue, do you want to print");
            interator = scanner.nextInt();
            scanner.close();

            System.out.println("Printing... Please wait!\n");

            for (int i = 0; i <= interator; i++) {
                if (i == interator) {
                    break;
                } else {
                    System.out.println("Print document " + (i + 1) + " of " + interator);
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The try catch it's done!");
        }
    }
}
