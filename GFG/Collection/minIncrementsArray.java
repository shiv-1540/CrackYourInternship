Approach 1=>
public int minIncrements(int[] arr) {
        // Code here
        int cnt=0;
        HashSet<Integer> hs=new HashSet<>();
     
       
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
               hs.add(arr[i]);
            }
            else{
                while(hs.contains(arr[i])){
                    cnt++;
                    arr[i]=arr[i]+1;
                }
                hs.add(arr[i]);
            }
            
        }
        return cnt;
    }
Approoch 2=>
public int minIncrements(int[] arr) {
        // Code here
        int cnt=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                int in=arr[i-1]-arr[i]+1;
                cnt+=in;
                arr[i]=arr[i-1]+1;
            }
        }
        return cnt;
    }
