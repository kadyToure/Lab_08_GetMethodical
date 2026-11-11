import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SSN Validation");
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Success! Valid SSN received: " + ssn + "\n");

        System.out.println("UC Student M Number Validation");

        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number: ", "^(M|m)\\d{5}$");
        System.out.println("Success! Valid M number received: " + mNumber + "\n");

        System.out.println("Menu Choice Validation");
        String menuChoice = SafeInput.getRegExString(scanner, "Enter menu choice [O-Open, S-Save, V-View, Q-Quit]: ", "^[OoSsVvQq]$");
        System.out.println("Success! Valid menu choice received: " + menuChoice);

        scanner.close();
    }
}
