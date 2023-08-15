package dhanush_ldp.design_patterns.factory;

public class BasicCalculator implements Calculator {
    @Override
    public double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new UnsupportedOperationException("Unsupported operator: " + operator);
        }
    }
}
