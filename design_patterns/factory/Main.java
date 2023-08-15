package dhanush_ldp.design_patterns.factory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Select Calculator Mode:");
            System.out.println("1. Basic");
            System.out.println("2. Scientific");
            System.out.println("3. Programmer");
            System.out.println("Enter your choice: ");

            int calculatorMode = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator;

            switch (calculatorMode) {
                case 1:
                    calculator = CalculatorFactory.createCalculator("Basic");
                    performCalculation(scanner, calculator);
                    break;
                case 2:
                    calculator = CalculatorFactory.createCalculator("Scientific");
                    performCalculation(scanner, calculator);
                    break;
                case 3:
                    calculator = CalculatorFactory.createCalculator("Programmer");
                    performCalculation(scanner, calculator);
                    break;
                default:
                    System.out.println("Invalid calculator mode!");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    private static void performCalculation(Scanner scanner, Calculator calculator) {
        double num1 = 0, num2 = 0;
        boolean validInput = false;

        do {
            try {
                System.out.println("Enter the first number: ");
                num1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                scanner.nextLine();

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter valid numeric values.");
                scanner.nextLine();
                validInput = false;
            }
        } while (!validInput);

        System.out.println("Enter the operator: ");
        String operator = scanner.nextLine();

        try {
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
