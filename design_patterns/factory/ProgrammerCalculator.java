package dhanush_ldp.design_patterns.factory;

public class ProgrammerCalculator implements Calculator {
    @Override
    public double calculate(double num1, double num2, String operator) {
        throw new UnsupportedOperationException("Programmer calculator does not support arithmetic calculations");
    }
}
