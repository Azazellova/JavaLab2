import java.util.Scanner;

public class Validation {

    public static int inputInteger(Scanner input, String prompt) {
        int value;
        System.out.print(prompt);
        while (!(input.hasNextInt())) {
            //input.nextLine();
            System.out.println("Ошибка ввода, повторите попытку: ");
            System.out.print("> ");
            input.next();
        }
        value = input.nextInt();
        input.nextLine();
        return value;
    }

    public static double inputDouble(Scanner input, String prompt) {
        double value;
        System.out.print(prompt);
        while (!(input.hasNextDouble())) {
            //input.nextLine();
            System.out.println("Ошибка ввода, повторите попытку: ");
            System.out.print("> ");
            input.next();
        }
        value = input.nextDouble();
        input.nextLine();
        return value;
    }

    public static int inputMark(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 1 && value <= 5) {
                    return value;
                } else {
                    System.out.println("Ошибка: введите целое число от 1 до 5.");
                }
            }
            else {
                System.out.println("Ошибка: введите целое число.");
                input.next();
            }
        }
    }
}
