import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        System.out.println("phone nuber");
        try (Scanner scnr = new Scanner(System.in)) {
            long input = scnr.nextLong();
            String phoneNumber = Long.toString(input);
            String areaCode = phoneNumber.substring(0, 3);
            String prefix = phoneNumber.substring(3, phoneNumber.length() - 4);
            String lineNumber = phoneNumber.substring(phoneNumber.length() - 4);

            System.out.println("(" + areaCode + ")" + " " + prefix + "-" + lineNumber);
        }
    }
}
