import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid integer.");
            }
        } while (!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean done = false;

        do {
            System.out.print(prompt + " ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid double value.");
            }
        } while (!done);

        return retVal;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high + ". You entered: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: You must enter a valid integer. You entered: " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        boolean isValid = false;
        String fullPrompt = prompt + " [" + low + " - " + high + "]: ";

        do {
            System.out.print(fullPrompt);
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    isValid = true;
                } else {
                    System.out.println("Error: Value out of range. Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Error: Invalid input (" + trash + "). Please enter a valid number.");
            }
        } while (!isValid);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        while (true) {
            System.out.print(prompt);
            if (pipe.hasNext()) {
                response = pipe.next();

                if (response.length() == 1) {
                    char ch = response.charAt(0);
                    if (ch == 'y' || ch == 'Y') {
                        return true;
                    } else if (ch == 'n' || ch == 'N') {
                        return false;
                    }
                }
            }

            System.out.println("Invalid input. Please enter [Y/N]: ");
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextLine()) {
                retString = pipe.nextLine();
                if (retString.matches(regEx)) {
                    done = true;
                } else {
                    System.out.println("Invalid input: \"" + retString + "\". Please match the required pattern.");
                }
            }
        } while (!done);

        return retString;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        int msgLength = msg.length();
        int totalSpaces = totalWidth - 6 - msgLength;
        int leftSpaces = totalSpaces / 2;
        int rightSpaces = totalSpaces - leftSpaces;

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}




