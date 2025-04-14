public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        solve(nums,0,res);
        return res;
    }
    public static void solve(int []nums,int ind,List<List<Integer>> res){
      //Base Condition
      if(ind==nums.length){
        List<Integer> temp=new ArrayList<>();
        for(int el:nums){
            temp.add(el);
        }
        res.add(temp);
        return ;
      }
     
      //Task 
       for(int i=ind;i<nums.length;i++){
          swap(nums,i,ind);
          solve(nums,ind+1,res);
          swap(nums,i,ind);
       }
        
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
