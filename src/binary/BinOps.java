package binary;

public class BinOps {
    public String mult(String a, String b) {
        int argA = Integer.parseInt(a, 2);
        int argB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(argA * argB);
    }

    public String sum(String a, String b) {
        int argA = Integer.parseInt(a, 2);
        int argB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(argA + argB);
    }
}
