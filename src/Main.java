


public class Main {

    public static void main(String[] args) {

        Expound countExpound = new Expound(2,3);
        Trigonometry countsTrigonometry = new Trigonometry();
        Rate countRate = new Rate(10,4);
        Basic count = new Basic();
        AllFunction countAllFunction = new AllFunction();
        System.out.println(countAllFunction.add(2,3,4));


        System.out.println(count.multiplication(3,6,2,-2));
        System.out.println(count.add(2,3,4));
        System.out.println(count.division(100,5,2,5));
        System.out.println(count.minus(10,2,3,1,2,3));
        System.out.println(countsTrigonometry.cos(90));
        System.out.println(countRate.rate(10,15));
        System.out.println(countExpound.expound(5,2));

    }

}
