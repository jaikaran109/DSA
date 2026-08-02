# Cyclic Sort

## Definition

Cyclic Sort is a sorting algorithm used for arrays containing numbers in a fixed range like **1 to n**.

It places each element at its correct position by swapping it with the element that should be there.

For an element `x`:

```
Correct Index = x - 1
```

### Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

# Example

### Input

```
arr = [3, 1, 5, 4, 2]
```

### Java Code

```java
public class CyclicSort {

    static void cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4, 2};

        cyclicSort(arr);

        for(int num : arr)
            System.out.print(num + " ");
    }
}
```

### Output

```
1 2 3 4 5
```

---

# Dry Run

Initial Array:

```
[3, 1, 5, 4, 2]
```

---

### Step 1

Current element = `3`

Correct index:

```
3 - 1 = 2
```

Element `3` should be at index `2`.

Swap index `0` and `2`.

```
[5, 1, 3, 4, 2]
```

---

### Step 2

Current element = `5`

Correct index:

```
5 - 1 = 4
```

Element `5` should be at index `4`.

Swap index `0` and `4`.

```
[2, 1, 3, 4, 5]
```

---

### Step 3

Current element = `2`

Correct index:

```
2 - 1 = 1
```

Element `2` should be at index `1`.

Swap index `0` and `1`.

```
[1, 2, 3, 4, 5]
```

---

### Step 4

Current element = `1`

Correct index:

```
1 - 1 = 0
```

`1` is already at its correct position.

Move to next index.

---

### Final Sorted Array

```
[1, 2, 3, 4, 5]
```

---

# Key Idea

Instead of comparing elements, Cyclic Sort directly places every number at its correct index using swapping.

It is mainly used in problems like:

- Find Missing Number
- Find Duplicate Number
- Find All Missing Numbers
- Find All Duplicates
- First Missing Positive