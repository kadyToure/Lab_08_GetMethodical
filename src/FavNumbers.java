import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favInt = SafeInput.getInt(scanner, "Enter your favorite integer ");
        double favDouble = SafeInput.getDouble(scanner, "Enter your favorite double: ");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);

        scanner.close();
    }
}
