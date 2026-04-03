class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = "";
        String gtr = "";
        if(word1.length == 1) str+=word1[0];
        else{
            for(int i = 0 ; i < word1.length ; i++){
                str += word1[i];
            }
        }
        if(word2.length == 1) gtr+=word2[0];
        else{
            for(int i = 0 ; i < word2.length ; i++){
                gtr += word2[i];
            }
        }

        return str.equals(gtr);
    }
}

