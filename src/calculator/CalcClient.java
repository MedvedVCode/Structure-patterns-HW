package calculator;

public class CalcClient {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(2, 10));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.mult(13,1));
    }
}
