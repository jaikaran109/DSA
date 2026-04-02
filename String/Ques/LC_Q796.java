class Solution {
    public boolean rotateString(String s, String goal) {
        // Must be same length and goal must exist within s + s
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}





// class Solution {
//     public boolean rotateString(String s, String goal) {
//         // Agar length alag hai toh rotation ho hi nahi sakti
//         if (s.length() != goal.length()) return false;
//         if (s.equals(goal)) return true;

//         String temp = s;
//         for (int i = 0; i < s.length(); i++) {
//             // Har baar pehla character uthao aur baaki string ke piche laga do
//             temp = temp.substring(1) + temp.charAt(0);
            
//             if (temp.equals(goal)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
