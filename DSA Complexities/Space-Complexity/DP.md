# Dynamic Programming — Time and Space Complexity

---

## Core Idea

DP converts exponential recursion to polynomial by storing results of subproblems.

```
Without DP:  O(2ⁿ)  — recomputes same subproblems
With DP:     O(n)   — compute each subproblem once
```

---

## Two Approaches

### Top-Down (Memoisation) — Recursion + Cache

```java
// Fibonacci with memo
int[] memo = new int[n + 1];
Arrays.fill(memo, -1);

int fib(int n) {
    if (n <= 1) return n;
    if (memo[n] != -1) return memo[n];      // return cached
    memo[n] = fib(n - 1) + fib(n - 2);     // compute and cache
    return memo[n];
}
// TC: O(n) — each subproblem computed once
// SC: O(n) — memo array + O(n) call stack = O(n)
```

### Bottom-Up (Tabulation) — Iterative

```java
// Fibonacci bottom-up
int fib(int n) {
    if (n <= 1) return n;
    int[] dp = new int[n + 1];
    dp[0] = 0; dp[1] = 1;
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
// TC: O(n)   SC: O(n)
```

### Space Optimised Bottom-Up

```java
// Fibonacci — only need last 2 values
int fib(int n) {
    if (n <= 1) return n;
    int prev2 = 0, prev1 = 1;
    for (int i = 2; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}
// TC: O(n)   SC: O(1) ← space optimised!
```

---

## Classic DP Problems

### 0/1 Knapsack

```java
int knapsack(int[] weights, int[] values, int W) {
    int n = weights.length;
    int[][] dp = new int[n + 1][W + 1];   // 2D table

    for (int i = 1; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
            dp[i][w] = dp[i-1][w];        // don't take item i
            if (weights[i-1] <= w) {
                dp[i][w] = Math.max(dp[i][w],
                    dp[i-1][w - weights[i-1]] + values[i-1]);   // take item i
            }
        }
    }
    return dp[n][W];
}
// TC: O(n × W)   SC: O(n × W)
// Space optimised: O(W) using 1D dp array
```

### Longest Common Subsequence (LCS)

```java
int lcs(String s1, String s2) {
    int m = s1.length(), n = s2.length();
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i-1) == s2.charAt(j-1))
                dp[i][j] = 1 + dp[i-1][j-1];
            else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    return dp[m][n];
}
// TC: O(m × n)   SC: O(m × n)
```

### Coin Change (Minimum Coins)

```java
int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);   // initialise to "infinity"
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if (coin <= i) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }
    return dp[amount] > amount ? -1 : dp[amount];
}
// TC: O(amount × coins.length)   SC: O(amount)
```

---

## Complexity Summary

| Problem | TC | SC | Optimised SC |
|---|---|---|---|
| Fibonacci | O(n) | O(n) | O(1) |
| 0/1 Knapsack | O(n × W) | O(n × W) | O(W) |
| LCS | O(m × n) | O(m × n) | O(min(m,n)) |
| Coin Change | O(amount × k) | O(amount) | — |
| Longest Inc. Subsequence | O(n²) | O(n) | O(n log n) with BS |
| Edit Distance | O(m × n) | O(m × n) | O(min(m,n)) |

---

## Key Pattern

```
1. Identify overlapping subproblems
2. Define state: dp[i] or dp[i][j] = answer for subproblem
3. Write recurrence relation
4. Determine order of computation
5. Check if space can be reduced (often O(n²) → O(n))
```