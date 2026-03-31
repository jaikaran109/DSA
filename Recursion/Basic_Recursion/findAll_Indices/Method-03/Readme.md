# 🔍 Find All Indices (Recursion - Without Passing List)

## 🧠 Approach Summary

In this approach:

* Each recursive call **creates its own new ArrayList**
* It checks the current index
* Then **merges the result from the recursive call (below)**

👉 This is a **top-down traversal + bottom-up result building**

---

## 💻 Code

```java
static ArrayList<Integer> find2(int[] arr, int target, int st) {

    // create a new list for every call
    ArrayList<Integer> list = new ArrayList<>();

    // base case: when index goes out of array
    if(st == arr.length) return list;

    // check current index
    if(arr[st] == target) {
        list.add(st); // add index if match found
    }

    // recursive call for next index
    ArrayList<Integer> ansFromBelow = find2(arr, target, st + 1);

    // merge current list with result from below calls
    list.addAll(ansFromBelow);

    // return final list for this call
    return list;
}
```

---

## 🧪 Example

```
arr = [1, 2, 3, 2]
target = 2
```

---

## 🌳 Recursion Tree

```
find2(0)
   |
   v
find2(1)  ← match (index 1)
   |
   v
find2(2)
   |
   v
find2(3)  ← match (index 3)
   |
   v
find2(4) → []
```

---

## 🔁 Forward Phase (Function Calls)

```
find2(0)
 → find2(1)
   → find2(2)
     → find2(3)
       → find2(4) → []
```

---

## 📦 Backtracking Phase (Result Building)

### 🔹 find2(4)

```
returns []
```

---

### 🔹 find2(3)

```
arr[3] = 2 ✅
list = [3]

ansFromBelow = []

final = [3]
```

---

### 🔹 find2(2)

```
arr[2] = 3 ❌
list = []

ansFromBelow = [3]

final = [3]
```

---

### 🔹 find2(1)

```
arr[1] = 2 ✅
list = [1]

ansFromBelow = [3]

final = [1, 3]
```

---

### 🔹 find2(0)

```
arr[0] = 1 ❌
list = []

ansFromBelow = [1, 3]

final = [1, 3]
```

---

## 📦 Stack Visualization

```
find2(0)
find2(1)
find2(2)
find2(3)
find2(4) → []
```

### Unwinding:

```
[3] → [3] → [1,3] → [1,3]
```

---

## 🔥 Pros

### ✅ Clean & Intuitive

Each function works independently (no shared state)

### ✅ No Side Effects

No global variables or shared list

### ✅ Easy to Understand

Great for beginners and interviews

### ✅ Functional Style

Pure input → output

---

## ❌ Cons

### ❌ Extra Space Usage

Every call creates a new list → high memory usage

### ❌ Time Overhead

Repeated copying due to `addAll()`

### ❌ Not Optimal

Time complexity increases due to repeated merging

---

## 📊 Complexity

* ⏱ Time Complexity: **O(n²)**
* 📦 Space Complexity: **O(n²)** (due to multiple lists)

---

## 🧠 Key Insight

👉 Each recursive call creates its own list
👉 Result is built during **backtracking phase**

---

## 🎯 Final Thought

This approach is simple and great for understanding recursion,
but not optimal for large inputs.
