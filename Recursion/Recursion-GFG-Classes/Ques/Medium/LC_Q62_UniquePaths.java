class Solution {
    public int uniquePaths(int m, int n) {
        if(n == 1 || m == 1) return 1;
        return uniquePaths(m,n-1) + uniquePaths(m-1,n);
    }
}


// Abhi TLE aayega kyuki bahut sare calls repeat ho rhe h -- ye DP se solve hoga
