 //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s=new Stack<>();
        
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' || x.charAt(i)=='['||x.charAt(i)=='('){
                s.push(x.charAt(i));
            }
            else{
                if((!s.isEmpty()) && ((x.charAt(i)==')' && s.peek()=='(') || (x.charAt(i)=='}'&& s.peek()=='{') ||(x.charAt(i)==']'&&s.peek()=='['))){
                  //  System.out.print(x+" ");
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
 
    }
