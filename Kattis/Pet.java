import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        int grades = 0, cook = 0;
        Scanner in = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += in.nextInt();
                
                if (sum > grades){
                    grades=sum;
                    cook = i;
                }
            }
        }
        System.out.println(cook + " " + grades);
    }
}
