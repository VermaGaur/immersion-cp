import java.util.*;
public class smallestnum {

        static long gcd(long a, long b)
        {
            if (a == 0 || b == 0)
                return 0;

            if (a == b)
                return a;

            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }

        public static long getRounding(long n, long k)
        {
            long rounding = (long)Math.pow(10, k);

            long result = gcd(rounding, n);

            return ((rounding * n) / result);
        }

        public static void main(String[] args)
        {
            long n = 375, k = 4;

            System.out.println( getRounding(n, k));

        }
    }
