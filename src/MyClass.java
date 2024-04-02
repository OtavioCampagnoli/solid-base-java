import java.util.Scanner;

public class MyClass {
    // Content Class Here
    public static void main(String[] args) {
        myMethod();
    }
    // Declaring a method
    public static void myMethod() {
        // declaring variables (integer, double and String)
        /* int age = 20; using multiple line comment*/
        double height = 2.02;
        // String name = "Otávio Campagnoli"; using single line comment

        // Data Structure (Conditions)
        /* if (idade >= 18) {
           System.out.println("You are be of age.");
        } else {
            System.out.println("You are minor.");
        } */
        // Using While Loop
        int count = 0;
        while (count < 5) {
            System.out.println("Counting 5 times using While Loop: " + count);
            count++;
        }
        // Declaring For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Counting 5 times using For Loop: ");
        }
        // Declaring an Array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(numbers[0] + numbers[8]); // 10

        // output
        System.out.println("Hello World!");

        // input
        // instance scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first name");
        String firstName = scanner.nextLine();
        System.out.println("Input your last name");
        String lastName = scanner.nextLine();
        System.out.println("Input your age");
        int age = scanner.nextInt();
        
        if(firstName.isEmpty()) {
            System.out.println("Your first name can not be empty.");
        } else if (lastName.isEmpty()) {
                System.out.println("Your last name can not be empty.");
        } else if (age <= 0) {
            System.out.println("Invalid Age, the age most be upper zero.");
        }
        else {
            System.out.println("Full Name: " + firstName + " " +  lastName + "\nAge: " +  age);
        }
    }
}