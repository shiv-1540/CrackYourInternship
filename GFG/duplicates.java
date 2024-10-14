   public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>()
        Map<Integer , Integer> map = new HashMap<>();
    int n = arr.length;
        
        //For frequency of element 
        for(int i =0 ; i  <  n ; i++)
            map.put( arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        
         for(var ele : map.entrySet()){
            if(ele.getValue() > 1){
                ans.add(ele.getKey());
            }
        }
        
        if (ans.isEmpty()) ans.add(-1);
        else {
            // Sort the result list to ensure ascending order
            Collections.sort(ans);
        }
        
        return  ans;
    }
