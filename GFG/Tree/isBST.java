  boolean isBST(Node root) {
       return help(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean help(Node node ,int min,int max){
        if(node==null){
            return true;
        }
        
        if(node.data<=min || node.data>=max){
            return false;
        }
        
        return help(node.left,min,node.data) && help(node.right,node.data,max);
    }


