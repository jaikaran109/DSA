class Solution {
    public String maxSumOfSquares(int num, int sum) {

        // agr sum is greater jb tm sare places pe 9 put kr ke add kro to then return ""
        if (sum > num * 9) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        // dekho tm assume kro ki 9 hai and minus krte jao means sbse phle 9 cover hoga and vo string me phle bhi h means ans already greater bnn rha
        while (sum >= 9) {
            ans.append('9');
            sum -= 9;
            num--;
        }

        // agr kuch rah jata h means vo 9 se chota hoga to tm usko insert kr do 
        if (sum > 0) {
            ans.append(sum);
            num--;
        }

        // now the main part agr tmhara sum cover ho gya h but num != 0 then paki places pe 0 add kr do
        // ur ans look lime 9992000 is num = 7 ans sum = 29 the number is already greter bcz u added the 9 at first place
        while (num > 0) {
            ans.append('0');
            num--;
        }

        return ans.toString();
    }
}








// TLE - Brute Force

// import java.util.*;

// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         int x = 1;
//         int y = 10;
//         for (int i = 1; i < num; i++) {
//             x *= 10;
//             y *= 10;
//         }
        
//         ArrayList<Integer> list = new ArrayList<>();
//         // Loop ko reverse chalayein taaki bade numbers pehle process ho sakein
//         for (int i = y - 1; i >= x; i--) {
//             int temp = i;
//             int ans = 0;
//             while (temp != 0) {
//                 ans += temp % 10;
//                 temp /= 10;
//             }
//             if (ans == sum) {
//                 list.add(i);
//             }
//         }
        
//         // Agar koi number match nahi hua
//         if (list.isEmpty()) {
//             return "";
//         }
        
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < list.size(); i++) {
//             int sqSum = 0;
//             int temp = list.get(i);
//             while (temp != 0) {
//                 int digit = temp % 10;
//                 sqSum += digit * digit;
//                 temp /= 10;
//             }
//             map.put(list.get(i), sqSum);
//         }
        
//         Integer maxKey = null;
//         Integer maxValue = null;

//         // Map par iterate karke max sqSum nikalo
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (maxValue == null || entry.getValue() > maxValue) {
//                 maxValue = entry.getValue();
//                 maxKey = entry.getKey();
//             } 
//             // Agar square sum tie ho jaye, toh jo key (number) badi ho use select karo
//             else if (entry.getValue().equals(maxValue)) {
//                 if (entry.getKey() > maxKey) {
//                     maxKey = entry.getKey();
//                 }
//             }
//         }
        
//         return maxKey != null ? maxKey.toString() : "";
//     }
// }
