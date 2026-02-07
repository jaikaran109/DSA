class Solution {
    public boolean halvesAreAlike(String s) {

        int count1 = 0;
        int count2 = 0;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + n / 2);
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'
             || c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U') {
                count1++;
            }
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'
             || c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U') {
                count2++;
            }
        }
        return count1 == count2;
    }
}
