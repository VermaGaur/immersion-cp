import java.util.*;
public class codeforces1899A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[] num = new int[t];
            for(int i=0;i<t;i++){
                num[i]=sc.nextInt();
            }
            for(int i=0;i<t;i++){
                if(num[i]%3==0){
                    System.out.println("Second");
                }else{
                    System.out.println("First");
                }
            }
        }
    }
}
