import java.util.Scanner;

/**
 * Created by Thales on 2016-02-29.
 */
public class MixedFraction {
    public static void main(String[] args){
        long rem, div;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            long top = in.nextInt();
            long bottom = in.nextInt();
            if (bottom != 0){
                rem = top % bottom;
                div = (top - rem) / bottom;
                System.out.println(div + " " + rem + " / " + bottom);
            }
        }
    }
}
