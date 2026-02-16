class Solution {
    public int finalPositionOfSnake(int n, List<String> command) {
        int i = 0;
        int j = 0;
        for(int k = 0 ; k < command.size() ; k++){
            if(command.get(k).equals("RIGHT")) j++;
            if(command.get(k).equals("LEFT")) j--;
            if(command.get(k).equals("DOWN")) i++;
            if(command.get(k).equals("UP")) i--;
        }
        return i * n + j;
    }
}




// For Understanding
// class Solution {
//     public int finalPositionOfSnake(int n, List<String> command) {
//         int[][] arr = new int[n][n];
//         int x = 0;
//         for(int i = 0 ; i < n ; i++){
//             for(int j = 0 ; j < n ; j++){
//                 arr[i][j] = x++;
//             }
//         }
//         int i = 0;
//         int j = 0;
//         for(int k = 0 ; k < command.size() ; k++){
//             if(command.get(k).equals("RIGHT")) j++;
//             if(command.get(k).equals("LEFT")) j--;
//             if(command.get(k).equals("DOWN")) i++;
//             if(command.get(k).equals("UP")) i--;
//         }
//         return arr[i][j];
//     }
// }
