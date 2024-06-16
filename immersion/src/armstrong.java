import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}


class Solution {
    static String armstrongNumber(int n) {
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        int sumOfCubes = (hundreds * hundreds * hundreds) +
                (tens * tens * tens) +
                (units * units * units);

        if (sumOfCubes == n) {
            return "true";
        } else {
            return "false";
        }
    }
}
