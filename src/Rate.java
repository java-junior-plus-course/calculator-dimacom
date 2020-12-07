public class Rate implements CalculatorRate {

    private double number;
    private double rate;

    public Rate() {
    }
    public Rate(double number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    @Override
    public double rate(double number, double rate) {
        return ( number/ 100 ) * rate;
    }
    }


