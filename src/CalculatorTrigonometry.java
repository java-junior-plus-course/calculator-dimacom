public interface CalculatorTrigonometry {

    public default double cos(double operandA) {
        return 0;
    }

    public double sin(double operandA);


    public double tan(double operandA);
}
