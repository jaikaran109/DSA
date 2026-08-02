# Frequently Used HashMap Syntax

## 1. Create a HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

---

## 2. Increase Frequency (Most Common)

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

Example

```java
int[] arr = {1,2,1,3};

HashMap<Integer,Integer> map = new HashMap<>();

for(int num : arr){
    map.put(num, map.getOrDefault(num,0)+1);
}
```

Result

```
1 -> 2
2 -> 1
3 -> 1
```

---

## 3. Get Frequency

```java
int freq = map.getOrDefault(num, 0);
```

Example

```java
System.out.println(map.getOrDefault(1,0));
```

Output

```
2
```

If the element is not present

```java
System.out.println(map.getOrDefault(100,0));
```

Output

```
0
```

---

## 4. Decrease Frequency (Sliding Window)

```java
map.put(num, map.get(num) - 1);
```

Example

Before

```
5 -> 3
```

After

```java
map.put(5, map.get(5)-1);
```

Result

```
5 -> 2
```

---

## 5. Remove Key When Frequency Becomes Zero

This is commonly used in **Sliding Window** problems.

```java
map.put(num, map.get(num)-1);

if(map.get(num) == 0){
    map.remove(num);
}
```

Example

Before

```
5 -> 1
```

After

```
{}
```

---

## 6. Check if Key Exists

```java
map.containsKey(num)
```

Example

```java
if(map.containsKey(5)){
    System.out.println("Present");
}
```

---

## 7. Check if Value Exists

```java
map.containsValue(3)
```

---

## 8. Insert or Update

```java
map.put(key, value);
```

Example

```java
map.put(10,5);
```

Later

```java
map.put(10,8);
```

Result

```
10 -> 8
```

The previous value is replaced.

---

## 9. Remove a Key

```java
map.remove(key);
```

Example

```java
map.remove(5);
```

---

## 10. Get Number of Stored Keys

```java
map.size();
```

---

## 11. Check if HashMap is Empty

```java
map.isEmpty();
```

---

## 12. Delete Everything

```java
map.clear();
```

---

## 13. Traverse Using keySet()

```java
for(int key : map.keySet()){
    System.out.println(key + " -> " + map.get(key));
}
```

---

## 14. Traverse Using entrySet() (Recommended)

```java
for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## 15. Iterate Only Over Keys

```java
for(int key : map.keySet()){
    System.out.println(key);
}
```

---

## 16. Iterate Only Over Values

```java
for(int value : map.values()){
    System.out.println(value);
}
```

---

## 17. First Time Insertion Only

```java
if(!map.containsKey(num)){
    map.put(num,1);
}
```

---

## 18. Increase Frequency Without getOrDefault()

```java
if(map.containsKey(num)){
    map.put(num, map.get(num)+1);
}
else{
    map.put(num,1);
}
```

---

# Quick Cheat Sheet

| Operation | Syntax |
|-----------|--------|
| Create | `HashMap<Integer,Integer> map = new HashMap<>();` |
| Increase Frequency | `map.put(x, map.getOrDefault(x,0)+1);` |
| Get Frequency | `map.getOrDefault(x,0)` |
| Decrease Frequency | `map.put(x, map.get(x)-1);` |
| Remove if Frequency = 0 | `if(map.get(x)==0) map.remove(x);` |
| Check Key | `map.containsKey(x)` |
| Check Value | `map.containsValue(v)` |
| Insert/Update | `map.put(key,value)` |
| Remove | `map.remove(key)` |
| Size | `map.size()` |
| Empty | `map.isEmpty()` |
| Clear | `map.clear()` |
| Keys | `map.keySet()` |
| Values | `map.values()` |
| Key-Value Pairs | `map.entrySet()` |