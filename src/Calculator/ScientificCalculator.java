package Calculator;

public class ScientificCalculator extends Calculator {

    public int modulo(int a, int b) {
        return a % b;
    }

    public double percentage(double a, int b) {
        return (a / 100.0) * b;
    }
}
