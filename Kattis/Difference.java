import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()){
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            long diff = Math.abs(y-x);
            System.out.println(diff);
        }
    }
}
