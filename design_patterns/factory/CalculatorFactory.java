package dhanush_ldp.design_patterns.factory;

public class CalculatorFactory {
    public static Calculator createCalculator(String mode) {
        switch (mode) {
            case "Basic":
                return new BasicCalculator();
            case "Scientific":
                return new ScientificCalculator();
            case "Programmer":
                return new ProgrammerCalculator();
            default:
                throw new IllegalArgumentException("Invalid calculator mode: " + mode);
        }
    }
}
