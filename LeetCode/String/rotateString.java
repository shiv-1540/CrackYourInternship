Logic1=>

public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }

Logic2=>

public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
