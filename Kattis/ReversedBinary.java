import java.util.Scanner;
public class ReversedBinary{
    private static Scanner in;

    public static void main(String[] args) {
        long numberInput, numberReverse;
        String numberBinary, numberBinaryReverse;
        in = new Scanner(System.in);

        numberInput = in.nextInt();
        numberBinary=Long.toString(numberInput,2);
        numberBinaryReverse = new StringBuffer(numberBinary).reverse().toString();
        numberReverse = Long.parseLong(numberBinaryReverse,2);
        System.out.println(numberReverse);
    }
}
