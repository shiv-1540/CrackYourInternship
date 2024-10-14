

static int help(int m,int cnt ,int[] arr,int n){
        if(m>=n-1){
            return cnt;
        }
        if(arr[m]==0){
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        
        for(int i=1;i<=arr[m];i++){
            int res=help(m+i,cnt+1,arr,n);
            mini=Math.min(mini,res);
        }
        return mini;
    }
    static int minJumps(int[] arr) {
        // your code here
        int n=arr.length;
        
        int result=help(0,0,arr,n);
        
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return result;
        }
    }
