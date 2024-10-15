#TRY ONE
public void sort012(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
            
    }
#TRY TWO
  public void sort012(int[] arr) {
        // code here
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        int i=0;
        while(cnt0>=1){
            arr[i]=0;
            i++;
            cnt0--;
        }
         while(cnt1>=1){
            arr[i]=1;
            i++;
            cnt1--;
        }
         while(cnt2>=1){
            arr[i]=2;
            i++;
            cnt2--;
        }
            
    }

## TRY THREE

    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int i=0,j=arr.length-1,k=0;
        
        while(i<=j){
            if(arr[i]==2){
                swap(arr,i,j);
                j--;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                swap(arr,i,k);
                i++;
                k++;
            }
            
        }
            
    }
