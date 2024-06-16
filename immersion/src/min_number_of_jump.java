class min_number_of_jump {
    public int jump(int[] nums) {
        int jumps=0;
        int current=0;
        int farthest=0;
        for(int i=0;i<nums.length-1;++i){
            if(i+nums[i]>farthest){
                farthest=i+nums[i];
            }

            if(i==current)
            {
                current=farthest;
                jumps++;
            }        }
        return jumps;
    }
}