# 🔍 Find All Indices (Using Global Variable)

## 🧠 Approach Summary

In this approach:

* A **global ArrayList** is used to store indices
* Recursive function directly **modifies the global list**
* No list is returned from the function

👉 This is the **simplest implementation** but uses shared state

---

## 💻 Code

```java id="k1z3pq"
static ArrayList<Integer> list = new ArrayList<>();

static void findIndices(int[] arr, int target, int st) {

    // base case: when index goes out of bounds
    if(st == arr.length) return;

    // check current index
    if(arr[st] == target) {
        list.add(st); // add index to global list
    }

    // recursive call for next index
    findIndices(arr, target, st + 1);
}
```

---

## 🧪 Example

```id="3b1tfi"
arr = [1, 2, 3, 2]
target = 2
```

```id="7c0s1k"
Output:
[1, 3]
```

---

## 🌳 Recursion Tree

```id="0ny2cd"
findIndices(0)
   |
   v
findIndices(1)  ← match (add 1)
   |
   v
findIndices(2)
   |
   v
findIndices(3)  ← match (add 3)
   |
   v
findIndices(4) → return
```

---

## 🔁 Execution Flow (Forward Phase)

```id="jrs9l8"
findIndices(0) → []
findIndices(1) → [1]
findIndices(2) → [1]
findIndices(3) → [1,3]
findIndices(4) → return
```

👉 All work happens during forward recursion

---

## 📦 Stack Visualization

```id="0tcey8"
findIndices(0)
findIndices(1)
findIndices(2)
findIndices(3)
findIndices(4)
```

👉 No values returned, just stack unwind

---

## 🔥 Pros

### ✅ Very Simple

Easy to write and understand

### ✅ No Extra Return Handling

No need to merge lists or return values

### ✅ Fast Execution

No copying or extra list creation

---

## ❌ Cons

### ❌ Uses Global Variable

Shared state can cause bugs in large programs

### ❌ Not Thread Safe

Multiple calls may interfere with each other

### ❌ Not Recommended in Interviews

Interviewers usually prefer pure recursion

---

## 📊 Complexity

* ⏱ Time Complexity: **O(n)**
* 📦 Space Complexity: **O(n)** (recursion stack)

---

## 🧠 Key Insight

👉 List is updated directly during recursion
👉 No backtracking or merging needed
👉 This is a **side-effect based approach**

---

## 🎯 Final Thought

This approach is simple and efficient,
but should be avoided in interviews due to use of global state.
