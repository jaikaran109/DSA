# 🔍 Find All Indices (Optimized - Passing List as Argument)

## 🧠 Approach Summary

In this approach:

* A **single ArrayList is passed as an argument**
* Each recursive call **modifies the same list**
* No new list is created at each step

👉 This makes it **memory efficient and faster**

---

## 💻 Code

```java
static ArrayList<Integer> find1(int[] arr, int target, int st, ArrayList<Integer> list) {

    // base case: when index goes out of bounds
    if(st == arr.length) return list;

    // check current index
    if(arr[st] == target) {
        list.add(st); // add index directly to shared list
    }

    // recursive call for next index
    return find1(arr, target, st + 1, list);
}
```

---

## 🧪 Example

```
arr = [1, 2, 3, 2]
target = 2
```

```
Output:
[1, 3]
```

---

## 🌳 Recursion Tree

```
find1(0)
   |
   v
find1(1)  ← match (add 1)
   |
   v
find1(2)
   |
   v
find1(3)  ← match (add 3)
   |
   v
find1(4) → return list
```

---

## 🔁 Forward Phase (Execution)

```
find1(0) → []
find1(1) → [1]
find1(2) → [1]
find1(3) → [1,3]
find1(4) → return [1,3]
```

---

## 📦 Stack Visualization

```
find1(0)
find1(1)
find1(2)
find1(3)
find1(4) → [1,3]
```

👉 No separate lists — same list flows through all calls

---

## 🔥 Pros

### ✅ Memory Efficient

Only **one list** is used throughout recursion

### ✅ Faster

No `addAll()` → no repeated copying

### ✅ Optimal Approach

Preferred in interviews

---

## ❌ Cons

### ❌ Side Effects

List is modified directly (shared state)

### ❌ Slightly Less Pure

Not purely functional (depends on external mutation)

---

## 📊 Complexity

* ⏱ Time Complexity: **O(n)**
* 📦 Space Complexity: **O(n)** (recursion stack)

---

## 🧠 Key Insight

👉 Same list is passed and updated
👉 No backtracking merge needed
👉 Work happens in **forward phase**

---

## 🎯 Final Thought

This is the **optimized version** of the problem and is generally preferred in real-world and interview scenarios.
