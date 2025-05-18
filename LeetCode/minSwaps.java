You are given an array nums of distinct positive integers. You need to sort the array in increasing order based on the sum of the digits of each number. If two numbers have the same digit sum, the smaller number appears first in the sorted order.

Return the minimum number of swaps required to rearrange nums into this sorted order
==>

  Input: nums = [18,43,34,16]

Output: 2

Explanation:

Compute the digit sum for each integer: [1 + 8 = 9, 4 + 3 = 7, 3 + 4 = 7, 1 + 6 = 7] → [9, 7, 7, 7]
Sort the integers based on digit sum: [16, 34, 43, 18]. Swap 18 with 16, and swap 43 with 34 to obtain the sorted order.
Thus, the minimum number of swaps required to rearrange nums is 2.


class Solution {
    
    //Helper Function
    public class Pair{
        int sum,index,val;
        
        Pair(int v,int s,int i){
            val=v;
            sum=s;
            index=i;
        }
    }
    
    public int sumofdigit(int num){
        int sum=0;
        
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        
        return sum;
    }
    
    public int minSwaps(int[] nums) {
        
        //Step1
        Pair[] pairs=new Pair[nums.length];
        
        for(int i=0;i<nums.length;i++){
            pairs[i]=new Pair(nums[i],sumofdigit(nums[i]),i);
        }
        
        //Step2
        
        Arrays.sort(pairs,(a,b)->{
            if(a.sum!=b.sum){
                return a.sum-b.sum;
            }
            return a.val-b.val;
        });
        
        
        //Step3 
        
        boolean[] visited=new boolean[nums.length];
        int swaps=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i] || pairs[i].index==i){
                continue;
            }
            
            int cyclesize=0;
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                j=pairs[j].index;
                cyclesize++;
            }
            if(cyclesize>1){
                swaps+=cyclesize-1;
            }
        }
        return swaps;
        
    }
}
