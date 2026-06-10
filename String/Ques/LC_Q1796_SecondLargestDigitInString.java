class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int secLar = -1;
        for(char ch : s.toCharArray()){

            if(ch >= 'a' && ch <= 'z' ) continue;

            else {
                int temp = ch - '0';
                if(temp > largest){
                    secLar = largest;
                    largest = temp;
                }else if(temp > secLar && temp < largest){
                    secLar = temp;
                }
            }
        }
        return secLar;
    }
}
