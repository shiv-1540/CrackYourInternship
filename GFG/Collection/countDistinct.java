   ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> brr=new ArrayList<Integer>();
        
        
        for(int right=k-1;right<arr.length;right++){
            int left=right-(k-1);
            HashSet<Integer> hs=new HashSet<>();
            while(left<=right){
                hs.add(arr[left]);
                left++;
            }
            brr.add(hs.size());
        }
        return brr;
    }
