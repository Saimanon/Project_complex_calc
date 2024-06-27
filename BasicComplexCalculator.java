public class BasicComplexCalculator implements ComplexCalculator {
    private Logger logger;

    public BasicComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
        logger.log("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Умножение: " + a + " * " + b + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws ArithmeticException {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Деление: " + a + " / " + b + " = " + result);
        return result;
    }
}