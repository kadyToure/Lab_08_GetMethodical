public class CtoFTableDisplay {
    public static void main(String[] args) {

        System.out.printf("%-12s %-12s%n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------");

        for (int c = -100; c <= 100; c++) {
            double f = SafeInput.CtoF(c);
            System.out.printf("%-12.1f %-12.1f%n", (double) c, f);
        }
    }

}
