// Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
       int cnt=0;
       int sum=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       
       map.put(0,1);
       for(int num:arr){
           sum+=num;
           map.put(sum,map.getOrDefault(sum,0)+1);
           if(map.containsKey(sum-tar)){
               cnt+=map.get(sum-tar);
           }
       }
       return cnt;
    }
