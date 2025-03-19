public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<arr.length-2;i++){
            HashMap<Integer,Integer> hp=new HashMap<>();
            for(int j=i+1;j<arr.length-1;j++){
               
                int sec=-arr[i]-arr[j];
                
                if(hp.containsKey(sec)){
                   List<Integer> ls=new ArrayList<>();
                   ls.add(i);
                   ls.add(hp.get(sec));
                   ls.add(j);
                   
                   list.add(ls);
                }
                
                hp.put(arr[j],j);
            }
            
        }
        return list;
    }

======================================================================
          public List<List<Integer>> findTriplets(int[] arr) {
        Map <Integer,List<Integer>> hash=new HashMap <>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int val=-1*(arr[i]+arr[j]);
                if(hash.containsKey(val)){
                    for(int k:hash.get(val)){
                        res.add(Arrays.asList(k,i,j));
                    }
                }
            }
            hash.putIfAbsent(arr[i],new ArrayList<>());
            hash.get(arr[i]).add(i);
        }    
        return res;
    }
