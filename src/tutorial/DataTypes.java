package tutorial;

public class DataTypes {

    public static void main(String[] args) {
        showAllDataTypes();        
    }

    public static void showAllDataTypes() {
        int myNum = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String
        short myShort = 5000; // Short (-32768) to (32767)
        double myDouble = 2.45d; // Double
        byte myByte = 127; // Byte (-128) to (127)

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myShort);
        System.out.println(myDouble);
        System.out.println(myByte);
    }

}
