import java.util.Scanner;
public class Ah {
    private static Scanner in;
    public static void main(String[] args) {
        String input1, input2;
        int size1, size2;
        in = new Scanner(System.in);

        input1 = in.next();
        size1 = input1.length();
        input2 = in.next();
        size2 = input2.length();

        if (size1 < size2){
            System.out.println("no");
        } else {
            System.out.println("go");
        }

    }
}
