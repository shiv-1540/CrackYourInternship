public int singleNumber(int[] nums) {
       int ans=0;
       for(int i=0;i<32;i++){
        int bitidx=1;
        int cnt=0;
        for(int num:nums){
            if((num>>i & 1)==1 ){
               cnt++;
            }
        }
        if(cnt%3!=0){
            ans|= 1<<i ;
        }
       }
       return ans;
    }
