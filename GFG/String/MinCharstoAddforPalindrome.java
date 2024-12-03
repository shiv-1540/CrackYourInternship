
Logic1=>
public static int minChar(String s) {
        int n=s.length();
        String new_str = s+"$"+(new StringBuilder(s).reverse().toString());
        int lps[] = new int[2*n+1];
        fill(lps,new_str,2*n+1);
        return n-lps[2*n];
    }
    static void fill(int a[],String s,int n){
        int i=0, j=1;
        while(j<n){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                a[j]=i;
                j++;
            }
            else{
                if(i==0)    j++;
                else    i=a[i-1];
            }
        }
    }


Logic2 => [Optimized]

 public static int minChar(String s) {
        int n=s.length();
        String new_str = s+"$"+(new StringBuilder(s).reverse().toString());
        int lps[] = new int[2*n+1];
        fill(lps,new_str,2*n+1);
        return n-lps[2*n];
    }
    static void fill(int a[],String s,int n){
        int i=0, j=1;
        while(j<n){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                a[j]=i;
                j++;
            }
            else{
                if(i==0)    j++;
                else    i=a[i-1];
            }
        }
    }
