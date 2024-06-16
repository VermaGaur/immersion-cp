public class coprime {
        int countCoPrime(int[] arr, int n) {
            int insertions = 0;

            for (int i = 0; i < n - 1; i++) {
                if (gcd(arr[i], arr[i + 1]) != 1) {
                    insertions++;
                }
            }

            return insertions;
        }

        int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
