class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int m = brokenLetters.length();
        String[] words = text.split(" ");
        int n = words.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            boolean flag = false;
            for(int j = 0 ; j < m ; j++){
                if(words[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                flag = true;
                break;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}
