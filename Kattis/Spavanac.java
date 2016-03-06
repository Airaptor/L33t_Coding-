import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour_in = in.nextInt(), min_in = in.nextInt(), convert_min, alarm_prediction, calc, hour_out, min_out;
        
        if (hour_in == 0){hour_in = 24;}
        if (min_in == 0){min_in = 60;}
        
        alarm_prediction = 45;
        convert_min = Math.round(hour_in * 60);
        calc = convert_min + min_in - alarm_prediction;
        hour_out = calc / 60;
        min_out = calc % 60;
        
        System.out.println(hour_out + " " + min_out);
    }
}
