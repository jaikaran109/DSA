# Tree - Complete Guide

## 📚 All Problems Covered (11 Problems)

---

## 1️⃣ Tree Basics (1 Problem) - Easy

| # | Problem | Time | Space | Concept |
|---|---------|------|-------|---------|
| 01 | Binary Tree Implementation | O(1) | O(n) | Node-based Structure |

**Time**: 15 min

---

## 2️⃣ Tree Traversals (2 Problems) - Easy

| # | Problem | Time | Space | Concept |
|---|---------|------|-------|---------|
| 01 | Level Order Traversal | O(n) | O(n) | BFS using Queue |
| 02 | PreOrder Iterative | O(n) | O(h) | Stack-based |

**Time**: 30 min

---

## 3️⃣ Binary Search Tree (1 Problem) - Medium

| # | Problem | Time | Space | Concept |
|---|---------|------|-------|---------|
| 01 | BST Implementation | O(log n) | O(n) | Insert/Search/Delete |

**Time**: 30 min

---

## 4️⃣ Tree Views (2 Problems) - Medium

| # | Problem | Time | Space | Concept |
|---|---------|------|-------|---------|
| 01 | Top View | O(n) | O(n) | Vertical Order + Level |
| 02 | Bottom View | O(n) | O(n) | Vertical Order |

**Time**: 30 min

---

## 5️⃣ Advanced Problems (5 Problems) - Medium-Hard

| # | Problem | Time | Space | Concept |
|---|---------|------|-------|---------|
| 01 | Height of Tree | O(n) | O(h) | Recursion |
| 02 | Diameter of Tree | O(n) | O(h) | Height at Each Node |
| 03 | Max Path Sum | O(n) | O(h) | Global Max |
| 04 | Symmetric Tree | O(n) | O(h) | Mirror Check |
| 05 | Vertical Traversal | O(n log n) | O(n) | Coordinate Sorting |

**Time**: 1 hour

---

## 🎯 Quick Revision (2.5 Hours Total)

### Day 1: Basics + Traversals (45 min)
1. Understand tree structure (15 min)
2. Master traversals (30 min)

### Day 2: BST + Views (1 hour)
1. BST operations (30 min)
2. Tree views (30 min)

### Day 3: Advanced (45 min)
1. Height and diameter (20 min)
2. Path sum problems (25 min)

---

## 📊 Pattern Recognition

| Pattern | When to Use | Problems |
|---------|-------------|----------|
| **Recursion** | Most tree problems | Height, Diameter, Path Sum |
| **BFS** | Level-order, views | Level Order, Top/Bottom View |
| **DFS** | PreOrder, InOrder, PostOrder | All traversals |
| **BST** | Sorted data | Search, Insert, Delete |

---

## ⚡ Complexity Cheat Sheet

| Operation | Time | Space |
|-----------|------|-------|
| Traversal | O(n) | O(h) |
| Search (BST) | O(log n) | O(h) |
| Insert (BST) | O(log n) | O(h) |
| Height | O(n) | O(h) |
| Diameter | O(n) | O(h) |

---

## 🚀 Interview Tips

### Tree Traversals:
- **PreOrder**: Root → Left → Right
- **InOrder**: Left → Root → Right (sorted for BST)
- **PostOrder**: Left → Right → Root
- **LevelOrder**: BFS using queue

### Common Patterns:
- Recursion for most problems
- BFS for level-order
- Global variable for max/min tracking
- Helper function with extra parameters

### Edge Cases:
- Empty tree (null root)
- Single node
- Skewed tree (all left or all right)
- Negative values

---

**Total Problems**: 11  
**Total Time**: ~2.5 hours  
**All Original Problems Covered**: ✅
