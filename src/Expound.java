public class Expound implements CalculatorExpound{

    private double number;
    private double pow;


    public Expound() {
    }
    public Expound(double number, double pow) {
        this.number = number;
        this.pow = pow;
    }

@Override
    public double expound(double number, double pow) {

        return  Math.pow(number,pow);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }
}
