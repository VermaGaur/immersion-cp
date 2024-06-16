public class lcmgcd {
        static Long[] lcmAndGcd(Long A , Long B) {
            // code here
            Long GCD = gcd(A,B);
            Long LCM = (A*B)/GCD;
            return new Long[]{LCM,GCD};
        }
        static Long gcd(Long A,Long B){
            while(A>0 && B>0){
                if(A>B){
                    A=A%B;
                }else{
                    B=B%A;
                }
            }
            if(A==0){
                return B;
            }else{
                return A;
            }
        }
    };
}
