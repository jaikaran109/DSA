class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;

        int repeat = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){

                map.put(grid[i][j],map.getOrDefault(grid[i][j], 0) + 1);

                if (map.get(grid[i][j]) == 2) {
                    repeat = grid[i][j];
                }

                sum += grid[i][j];
            }
        }

        int total = n * m;
        int expectedSum = total * (total + 1) / 2;
        
        int missing = expectedSum - (sum - repeat);

        return new int[]{repeat,missing};

    }
}
