package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSecondExample {
    public static void main(String[] args) {

        LinkedList<String> phoneNumbers = new LinkedList<>();

        phoneNumbers.add("123-456-7890");
        phoneNumbers.add("456-789-1234");
        
        System.out.println(phoneNumbers);

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}