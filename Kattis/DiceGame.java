import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name="";
        int roll=0, gunnar=0, emma=0;
        for (int i = 0; i < 4; i++) {
            roll = in.nextInt();
            gunnar += roll;
        }
        roll = 0;
        for (int j = 0; j < 4; j++) {
            roll = in.nextInt();
            emma += roll;
        }
        if (emma > gunnar){name = "Emma";}
        if(gunnar > emma){name = "Gunnar";}
        if(gunnar == emma){name = "Tie";}
        System.out.println(name);
    }
}
