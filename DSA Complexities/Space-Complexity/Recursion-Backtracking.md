# Recursion & Backtracking — Time and Space Complexity

---

## Recursion Complexity Rules

| Pattern | TC | SC |
|---|---|---|
| `f(n) → f(n-1)` | O(n) | O(n) |
| `f(n) → f(n/2)` | O(log n) | O(log n) |
| `f(n) → f(n-1) + f(n-1)` | O(2ⁿ) | O(n) |
| `f(n) → f(n-1) + f(n-2)` | O(2ⁿ) | O(n) |

---

## Backtracking — General Template

```java
void backtrack(state, choices) {
    if (base_case) {
        result.add(copy of state);
        return;
    }
    for (each choice) {
        make choice;
        backtrack(updated state, remaining choices);
        undo choice;   // ← this is the "back" in backtracking
    }
}
```

---

## Generate All Subsets — O(2ⁿ × n)

```java
List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    return result;
}

void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
    result.add(new ArrayList<>(curr));      // O(n) to copy

    for (int i = start; i < nums.length; i++) {
        curr.add(nums[i]);
        backtrack(nums, i + 1, curr, result);
        curr.remove(curr.size() - 1);       // undo
    }
}
// Total subsets: 2ⁿ, each copied in O(n)
// TC: O(2ⁿ × n)   SC: O(n) recursion depth + O(2ⁿ × n) output
```

---

## All Permutations — O(n! × n)

```java
void permute(int[] nums, int start, List<List<Integer>> result) {
    if (start == nums.length) {
        result.add(/* array to list */);
        return;
    }
    for (int i = start; i < nums.length; i++) {
        swap(nums, start, i);
        permute(nums, start + 1, result);
        swap(nums, start, i);   // undo
    }
}
// Total permutations: n!
// TC: O(n! × n)   SC: O(n) depth + O(n! × n) output
```

---

## N-Queens — O(n!)

```java
// Place n queens on n×n board with no attacks
void solve(int row, int[] cols, boolean[] diag1, boolean[] diag2,
           List<List<String>> result, int n) {
    if (row == n) {
        result.add(buildBoard(cols, n));
        return;
    }
    for (int col = 0; col < n; col++) {
        if (cols[col] || diag1[row - col + n] || diag2[row + col]) continue;
        cols[col] = diag1[row - col + n] = diag2[row + col] = true;
        solve(row + 1, cols, diag1, diag2, result, n);
        cols[col] = diag1[row - col + n] = diag2[row + col] = false;
    }
}
// TC: O(n!)   SC: O(n) for recursion + O(n²) per solution
```

---

## Summary

| Problem | TC | SC |
|---|---|---|
| Subsets | O(2ⁿ × n) | O(n) |
| Permutations | O(n! × n) | O(n) |
| Combinations | O(C(n,k) × k) | O(k) |
| N-Queens | O(n!) | O(n) |
| Sudoku solver | O(9^(n²)) | O(n²) |