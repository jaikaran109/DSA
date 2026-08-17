# Space Complexity Cheat Sheet

## Quick Reference

| Code / Structure | SC | Notes |
|---|---|---|
| Fixed variables only | O(1) | No scaling with input |
| Array of size n | O(n) | |
| 2D array n×m | O(n×m) | |
| HashMap / HashSet (n entries) | O(n) | |
| Recursion depth d | O(d) | Call stack |
| Single loop, no extra DS | O(1) | |
| Two pointers | O(1) | |
| Sliding window + map | O(k) | k = window / distinct |
| Prefix sum array | O(n) | |
| DP 1D table | O(n) | |
| DP 2D table | O(n×m) | Often reducible to O(n) |
| BFS queue | O(n) | Widest level |
| DFS stack / recursion | O(h) | h = height |

## Recursion Stack Space

| Pattern | SC |
|---|---|
| f(n) → f(n-1) | O(n) |
| f(n) → f(n/2) | O(log n) |
| f(n) → f(n-1)+f(n-1) | O(n) depth only |
| Merge sort | O(log n) stack + O(n) temp |
| Binary search recursive | O(log n) |

## Sorting Space

| Algorithm | SC |
|---|---|
| Bubble / Selection / Insertion | O(1) |
| Heap Sort | O(1) |
| Quick Sort | O(log n) avg |
| Merge Sort | O(n) |
| Counting Sort | O(k) |
| Arrays.sort (Java) | O(log n) |

## Graph Space

| Structure | SC |
|---|---|
| Adjacency Matrix | O(V²) |
| Adjacency List | O(V + E) |
| BFS queue | O(V) |
| DFS recursion | O(V) |

## Tree Space

| Operation | Balanced | Skewed |
|---|---|---|
| DFS traversal | O(log n) | O(n) |
| BFS level-order | O(n) | O(1) |

## Space Optimisation Tips

DP O(n×m) → O(n): use two rows instead of full table
DP O(n) → O(1): use two variables (e.g. Fibonacci)
Recursion O(n) → O(1): convert to iterative with explicit stack

## Auxiliary vs Total Space

Total Space    = Input + Auxiliary
Auxiliary Space = Extra space only — this is what we report

Example: Sort n elements
  Total    = O(n) input + O(log n) aux
  Auxiliary = O(log n) — report this