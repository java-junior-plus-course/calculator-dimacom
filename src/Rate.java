public class Rate extends Trigonometry {
    private double number;
    private double rate;

    public Rate() {

    }

    public Rate(double number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    public double rate(double number, double rate) {
        return (number / 100) * rate;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
