# Identical Tree (Structurally)

**Problem**: Check if two binary trees are structurally identical (same structure, ignoring values).

**Core Concept**:
- Recursively compare left and right subtrees
- Both null → identical
- One null → not identical

**Example**:
```
Tree1:    10          Tree2:    10
         /  \                  /  \
        20  30                20  30
```
Result: Structurally Identical ✓

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(h) - recursion stack height

**Code**:
```java
boolean structurallyIdentical(Node t1, Node t2) {
    if(t1 == null && t2 == null) return true;
    if(t1 == null || t2 == null) return false;
    return structurallyIdentical(t1.left, t2.left) && 
           structurallyIdentical(t1.right, t2.right);
}
```
