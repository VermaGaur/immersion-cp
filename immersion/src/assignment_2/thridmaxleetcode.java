public class thridmaxleetcode {

        public int thirdMax(int[] nums) {
            long firstMax, secMax, thirdMax;
            firstMax = secMax = thirdMax = Long.MIN_VALUE;

            for(int n : nums){
                if(n > firstMax){
                    thirdMax = secMax;
                    secMax = firstMax;
                    firstMax = n;
                }
                else if(n > secMax && n != firstMax){
                    thirdMax = secMax;
                    secMax = n;
                }
                else if(n > thirdMax && n != firstMax && n != secMax){
                    thirdMax = n;
                }
            }
            if(thirdMax==Long.MIN_VALUE){
                return (int)firstMax;
            }
            return (int)thirdMax;
        }
    }
}
