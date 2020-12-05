

public class Basic implements CalculatorBasic {

    private double numberResult;

    @Override
    public double add(double... numbers) {
        numberResult = 0;
        for (double number : numbers) {
            numberResult = numberResult + number;
        }
        return numberResult;
    }

    @Override
    public double minus(double... numbers) {
        numberResult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numberResult = numberResult - numbers[i];
        }
        return numberResult;
    }

    @Override
    public double multiplication(double... numbers) {
        numberResult = 1;
        for (double number : numbers) {
            numberResult = numberResult * number;
        }
        return numberResult;
    }

    @Override
    public double division(double... numbers) {
        numberResult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numberResult = numberResult / numbers[i];
        }
        return numberResult;
    }



}
