int countPairs(int arr[], int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        int cnt=0;
        
        for(int num:arr){
            if(hs.containsKey(target-num)){
                cnt+=hs.get(target-num);
                
            }
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
      
        return cnt;
    }
