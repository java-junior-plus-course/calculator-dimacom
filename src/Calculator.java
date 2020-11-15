

public class Calculator {
    private double operandOne;
    private double operandTwo;

    public Calculator() {
    }

    public Calculator(double operandOne, double operandTwo) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;

    }

    public double add() {
        return operandOne + operandTwo;
    }

    public double minus() {
        return operandOne - operandTwo;
    }

    public double multi() {
        return operandOne * operandTwo;
    }

    public double divvy() {
        return operandOne / operandTwo;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
}
