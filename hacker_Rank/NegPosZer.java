import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NegPosZer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos=0, neg=0, zer=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){pos++;}
            if(arr[arr_i]<0){neg++;}
            if(arr[arr_i]==0){zer++;}
        }
        pos = pos / n;
        neg = neg / n;
        zer = zer / n;
        System.out.print(pos + "\n"+neg+"\n"+zer);
    }
}
