private void find(int idx,int []arr,int target,List<List<Integer>> list,List<Integer> ds){
      if(idx==arr.length){
         if(target==0){
            list.add(new ArrayList<>(ds));
         }
         return;
      }
      if(arr[idx]<=target){
         ds.add(arr[idx]);
         find(idx,arr,target-arr[idx],list,ds);
         ds.remove(ds.size()-1);
      }
      find(idx+1,arr,target,list,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        find(0,candidates,target,list,new ArrayList<>());
        return list;
    }
