import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int measure, dist, time_curr, time;
        while (in.hasNextInt()){

            int miles = 0, time_prev=0;
            measure = in.nextInt();
            if (measure != -1) {
                for (int i = 0; i < measure; i++) {

                    dist = in.nextInt();
                    time_curr = in.nextInt();
                    time = time_curr - time_prev;
                    time_prev = time_curr;

                    miles += dist * time;
                }
                System.out.println(miles + " miles");
            }
        }
    }
}
