package binary;

public class BinOpsShow {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.printf(bins.sum("11101","10101"));
        System.out.println(bins.mult("1111101010", "101010111110"));
    }
}
