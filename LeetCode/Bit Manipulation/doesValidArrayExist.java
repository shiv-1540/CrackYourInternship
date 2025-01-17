 ###LITERALYY VERY HAPPY AFTER GETTTING  ACCEPTED 
// Example 1:

// Input: derived = [1,1,0]
// Output: true
// Explanation: A valid original array that gives derived is [0,1,0].
// derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1 
// derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
// derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0

 public boolean doesValidArrayExist(int[] derived) {
        
        if(derived.length==1 ){
            if(derived[0]==1){
                return false;
            }
            return true;
        }

        int brr1[]=new int[derived.length];
        int brr2[]=new int[derived.length];

        if(derived[0]==0){
            brr1[0]=0;
            brr1[1]=0;
            brr2[0]=1;
            brr2[1]=1;
        }
        else{
            brr1[0]=0;
            brr1[1]=1;
            brr2[0]=1;
            brr2[1]=0;
        }

        for(int i=1;i<derived.length-1;i++){
           if(derived[i]==0){
              if(brr1[i]==0){
                  brr1[i+1]=0;
              }
              else{
                 brr1[i+1]=1;
              }
              if(brr2[i]==0){
                  brr2[i+1]=0;
              }
              else{
                 brr2[i+1]=1;
              }
           }
           else{
              if(brr1[i]==0){
                  brr1[i+1]=1;
              }
              else{
                 brr1[i+1]=0;
              }
              if(brr2[i]==0){
                  brr2[i+1]=1;
              }
              else{
                 brr2[i+1]=0;
              }
           }
        }
        if(derived[derived.length-1]==(brr1[0]^brr1[derived.length-1])|| derived[derived.length-1]==(brr2[0]^brr2[derived.length-1])){
            return true;
        }
        else{
            return false;
        }
    }
