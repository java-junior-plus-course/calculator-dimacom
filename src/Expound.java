public class Expound extends Rate {
    private double number;
    private double pow;

    public Expound() {
    }

    public double expound(double number, double pow) {
        return Math.pow(number, pow);
    }

}
