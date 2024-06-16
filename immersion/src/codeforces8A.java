import java.util.Scanner;

public class codeforces8A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int w = scanner.nextInt();

            if (w > 2) {
                if (w % 2 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }

            scanner.close();
        }
    }

}
