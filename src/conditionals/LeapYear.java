package conditionals;

public class LeapYear {
    /*
     * Write a Java program to check if a given year is a leap year or not using
     * if-else statement.
     * 
     */
    public static void main(String[] args) {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
