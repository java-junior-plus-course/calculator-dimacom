public class Trigonometry implements CalculatorTrigonometry {

    double operandA;

    public Trigonometry() {

    }

    public Trigonometry(double operandA) {
        this.operandA = operandA;
    }

    @Override
    public double cos(double operandA) {
        return Math.cos(operandA);
    }

    @Override
    public double sin(double operandA) {
        return Math.sin(operandA);
    }

    @Override
    public double tan(double operandA) {
        return Math.tan(operandA);
    }

    /* public double sin(double operandA) {
        return Math.sin(operandA);
    }

    public double cos(double operandA) {
        return Math.cos(operandA);
    }

    public double tan(double operandA) {
        return Math.tan(operandA);
    }


    public double getOperandA() {
        return operandA;
    }

    public void setOperandA(double operandA) {
        this.operandA = operandA;
    }*/
}
