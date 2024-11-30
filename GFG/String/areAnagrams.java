  public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int arr[]=new int[26];
        int idx;
        
        for(int i=0;i<s1.length();i++){
            idx=s1.charAt(i)-'a';
            arr[idx]+=1;
        }
        for(int i=0;i<s2.length();i++){
            idx=s2.charAt(i)-'a';
            arr[idx]-=1;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
