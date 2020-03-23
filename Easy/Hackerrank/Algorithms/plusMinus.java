import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        int pos=0,neg=0,zer=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
               neg++;
            else if(arr[i]>0)
               pos++;
            else
               zer++;
        }
        System.out.println(pos*1.0/arr.length+"\n"+neg*1.0/arr.length+"\n"+zer*1.0/arr.length);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
