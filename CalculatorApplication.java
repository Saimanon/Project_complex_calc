public class CalculatorApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("console", null);
        ComplexCalculator calculator = new BasicComplexCalculator(logger);

        ComplexNumber a = new ComplexNumber(4, 3);
        ComplexNumber b = new ComplexNumber(2, -1);

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);
    }
}