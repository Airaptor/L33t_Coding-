import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String out;
        int x, n;
        n=in.nextInt();
        for (int i = 0; i < n; i++) {
            x=in.nextInt();
            if(x % 2 == 0){
                out = "even";
            }else {out = "odd";}
            System.out.println(x +" is "+ out);
        }
    }
}
