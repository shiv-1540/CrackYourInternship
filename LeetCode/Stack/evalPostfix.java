    public boolean isOperand(String ch){
      if(ch.equals("+")|| ch.equals("-")|| ch.equals("*")|| ch.equals("/")){
        return true;
      }
      return false;
    }

    public int evalRPN(String[] tokens) {
        
       Stack<Integer> st=new Stack<>();

       for(String ch :tokens){
            if(isOperand(ch)){
                int ch1=st.peek();
                st.pop();
                int ch2=st.peek();
                st.pop();

                if(ch.equals("+")){
                  st.push(ch2+ch1);
                }
                else if(ch.equals("-")){
                  st.push(ch2-ch1);
                }
                else if(ch.equals("*")){
                  st.push(ch2*ch1);
                }
                else if(ch.equals("/")){
                  st.push(ch2/ch1);
                } 
            }
            else{
                int num=Integer.parseInt(ch);
                st.push(num);
            }
       }
      return st.peek();
    }
