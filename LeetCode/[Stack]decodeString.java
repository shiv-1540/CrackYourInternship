class Solution {

    private boolean isDigit(String str){
       try{
            Integer.parseInt(str);
            return true;
       }
       catch(NumberFormatException e){
            return false;
       }
    }
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                st.push(Character.toString(s.charAt(i)));
            }
            else{
               String res="";
               while(!st.isEmpty() && !st.peek().equals("[")){
                  res=st.peek()+res;
                  st.pop();
               }
               st.pop();
          
               int n=Integer.parseInt(st.peek());
               st.pop();
               int cnt=1;
               while(!st.isEmpty() && isDigit(st.peek())){
                    n=n+(int)Math.pow(10,cnt)*Integer.parseInt(st.peek());
                    cnt++;
                    st.pop();
               }
               String ans=res.repeat(n);
          
               st.push(ans);
            }

            }
             
            String fans="";
            while(!st.isEmpty()){
                fans=st.peek()+fans;
                st.pop();
            }

        return fans;
    }
}
