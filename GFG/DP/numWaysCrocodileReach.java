    public static int numWays(String s) {
        // code here
        if(s.length()==0){
            return 0;
        }
        int MOD = 1000000007;
        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=0;i<s.length();i++){
            if(dp[i]==0) continue;
            
            if(s.charAt(i)=='0'){
                if(i+1<=n) dp[i+1]=dp[i+1]+dp[i]%MOD;
                if(i+2<=n) dp[i+2]=dp[i+2]+dp[i]%MOD;
            }
            else{
                 if(i+1<=n) dp[i+1]=dp[i+1]+dp[i]%MOD;
            }
        }
        return dp[n-1]%MOD;
    }
