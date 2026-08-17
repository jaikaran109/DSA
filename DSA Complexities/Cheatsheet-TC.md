# Time Complexity Cheat Sheet

## Big O Hierarchy (fastest to slowest)

| Complexity | Name | Example |
|---|---|---|
| O(1) | Constant | Array access, HashMap get |
| O(log n) | Logarithmic | Binary search, BST ops |
| O(n) | Linear | Single loop, linear search |
| O(n log n) | Linearithmic | Merge sort, heap sort |
| O(n²) | Quadratic | Nested loops, bubble sort |
| O(2ⁿ) | Exponential | Recursive subsets, fib naive |
| O(n!) | Factorial | All permutations |

## Pattern → Complexity

| Code Pattern | TC |
|---|---|
| Single loop | O(n) |
| Two sequential loops | O(n) |
| Nested loop (j resets) | O(n²) |
| Two pointers (forward only) | O(n) |
| Sliding window | O(n) |
| Loop with i/=2 or i*=2 | O(log n) |
| Binary search | O(log n) |
| Recursion: f(n-1) | O(n) |
| Recursion: f(n/2) | O(log n) |
| Recursion: f(n-1)+f(n-1) | O(2ⁿ) |
| Divide & conquer + merge | O(n log n) |
| Generate all subsets | O(2ⁿ) |
| Generate all permutations | O(n!) |

## Data Structure Operations

### Array
| Op | TC |
|---|---|
| Access arr[i] | O(1) |
| Search (unsorted) | O(n) |
| Search (sorted) | O(log n) |
| Insert/delete at end | O(1) |
| Insert/delete at middle | O(n) |

### HashMap / HashSet
| Op | TC |
|---|---|
| get / put / contains | O(1) avg |
| Iterate all entries | O(n) |

### Stack / Queue
| Op | TC |
|---|---|
| push / pop / peek | O(1) |
| Search | O(n) |

### BST (balanced)
| Op | TC |
|---|---|
| Search / Insert / Delete | O(log n) |
| Traversal | O(n) |

### Heap / Priority Queue
| Op | TC |
|---|---|
| peek (min/max) | O(1) |
| offer / poll | O(log n) |
| Build from n elements | O(n) |

## Sorting Algorithms

| Algorithm | Best | Average | Worst |
|---|---|---|---|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) |
| Arrays.sort (Java) | — | O(n log n) | O(n log n) |

## Graph Algorithms

| Algorithm | TC |
|---|---|
| BFS | O(V + E) |
| DFS | O(V + E) |
| Topological Sort | O(V + E) |
| Dijkstra (min-heap) | O((V+E) log V) |
| Bellman-Ford | O(V × E) |
| Floyd-Warshall | O(V³) |

## Common LeetCode Patterns

| Pattern | TC |
|---|---|
| Two Sum (HashMap) | O(n) |
| Sliding window | O(n) |
| Prefix sum build | O(n) |
| Prefix sum query | O(1) |
| Binary search on answer | O(n log n) |
| DP 1D table | O(n) |
| DP 2D table | O(n × m) |
| Backtracking subsets | O(2ⁿ × n) |
| Backtracking permutations | O(n! × n) |