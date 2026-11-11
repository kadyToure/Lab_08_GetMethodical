import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter birth year (1950-2015): ", 1950, 2015);

        int month = SafeInput.getRangedInt(scanner, "Enter birth month (1-12): ", 1, 12);

        int maxDays;
        switch (month) {
            //group1
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;
            // group2
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            // group3
            case 2:
                maxDays = 29;
                break;
            default:
                maxDays = 31;
                break;
        }

        int day = SafeInput.getRangedInt(scanner, "Enter birth day (1-" + maxDays + "): ", 1, maxDays);

        int hours = SafeInput.getRangedInt(scanner, "Enter birth hour (1-24): ", 1, 24);

        int minutes = SafeInput.getRangedInt(scanner, "Enter birth minute (1-59): ", 1, 59);

        System.out.println("\nBirth Date and Time Summary");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);

        scanner.close();
    }
}
