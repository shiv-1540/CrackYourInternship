public int isPrefixOfWord(String sentence, String searchWord) {
        String words[]=sentence.split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].length()>=searchWord.length()){
                String temp=words[i].substring(0,searchWord.length());
                if(temp.equals(searchWord)){
                    return i+1;
                }
            }
        }
        return -1;
    }
