 public boolean canChange(String start, String target) {
        if(start.equals(target)){
            return true;
        }
        int wl=0;
        int wr=0;

        for(int i=0;i<start.length();i++){
            char curr=start.charAt(i);
            char goal=target.charAt(i);

            if(curr=='R'){
               if(wl>0){
                 return false;
               }
               wr++;
            }
            if(goal=='L'){
                if(wr>0){
                    return false;
                }
                wl++;
            }
            if(goal=='R'){
                if(wr==0){
                    return false;
                }
                wr--;
            }
            if(curr=='L'){
                if(wl==0){
                    return false;
                }
                wl--;
            }
        }

        return wr==0 && wl==0;
    }
