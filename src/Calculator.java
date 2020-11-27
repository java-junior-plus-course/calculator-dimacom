

public class Calculator {

    public double add(double... numbers) {

        double numbersResult = 0;
        for (double tempNumber : numbers) {
            numbersResult = numbersResult + tempNumber;
        }
        return numbersResult;
    }

    public double minus(double... numbers) {

        double numberResult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numberResult = numberResult - numbers[i];
        }
        return numberResult;
    }

    public double multiplication(double... numbers) {

        double numberResult = 1;
        for (double tempNumber : numbers) {
            numberResult = numberResult * tempNumber;

        }
        return numberResult;
    }

    public double division(double... numbers) {
        double numberResult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numberResult = numberResult / numbers[i];
        }
        return numberResult;
    }

}
