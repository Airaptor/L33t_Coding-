import java.util.Scanner;
public class Stairs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h, v, length_i;
        double hyp, length_d;

        h = in.nextInt();
        v = in.nextInt();
        hyp = Math.toRadians(v);
        length_d = h/(Math.sin(hyp));
        length_i = (int) length_d;
        System.out.println(length_i+1);
    }
}
