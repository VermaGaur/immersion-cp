import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces1886A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            String result = findTriplet(n);
            System.out.println(result);
        }
    }

    static String findTriplet(int n) {
        for (int x = 1; x < n - 1; x++) {
            if (x % 3 == 0) continue;
            for (int y = x + 1; y < n; y++) {
                if (y % 3 == 0) continue;
                int z = n - x - y;
                if (z > y && z % 3 != 0) {
                    return "YES\n" + x + " " + y + " " + z;
                }
            }
        }
        return "NO";
    }
}
