public class palindrome {
        int sum=0;
        public boolean isPalindrome(int x) {
            int temp=x;
            if(x<0){
                return false;
            }
            while(x!=0){
                int rem=x%10;
                sum=sum*10+rem;
                x=x/10;
            }
            return temp==sum;
        }
    }
}
