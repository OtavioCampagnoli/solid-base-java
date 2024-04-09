package dataStructures;

public class ArraysFirstExample {
    public static void main(String[] args) {

        // Arrays are a basic data structure in Java that store elements of the same
        // data type in contiguous memory locations.
        int[] grades = { 85, 90, 75, 92, 88 };
        String[] employees = { "Otavio", "Sophie", "Jesse", "Matheus", "Gabrielly" };

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);

        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee:" + " Position: " + i + "\nName: " + employees[i] + "\n");
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grades:" + " Position: " + i + "\nGrade: " + grades[i] + "\n");
        }
    }
}
