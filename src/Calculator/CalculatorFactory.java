package Calculator;

public class CalculatorFactory {

    public Calculator getCalculator(CalculatorType type) {
        if(type == CalculatorType.NORMAL) {
            return new Calculator();
        }
        else if(type == CalculatorType.SCIENTIFIC) {
            return new ScientificCalculator();
        }
        else {
            return new Calculator();
        }
    }
}
