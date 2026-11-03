# Bitwise Operations & Tricks for Competitive Programming

A practical reference for the bitwise tricks that come up again and again in competitive programming (CP) and coding interviews. Every trick comes with the idea behind it, a worked binary example, C++ code, and the mistakes people commonly make.

> **Why bother?** Bit tricks give you O(1) answers to questions that otherwise need loops, and they let you pack a whole set of yes/no values into a single integer (a *bitmask*). That second use is what makes bitmask DP and subset enumeration fast.

---

## Table of contents

1. [Quick refresher: the bitwise operators](#quick-refresher-the-bitwise-operators)
2. [The 10 tricks](#the-10-tricks)
   1. [Check if a number is even or odd](#1-check-if-a-number-is-even-or-odd)
   2. [Check if a number is a power of two](#2-check-if-a-number-is-a-power-of-two)
   3. [Manipulate the k-th bit](#3-manipulate-the-k-th-bit)
   4. [Fast multiplication and division by 2^k](#4-fast-multiplication-and-division-by-2k)
   5. [Efficient modulo by 2^k](#5-efficient-modulo-by-2k)
   6. [Swap two variables without a temporary](#6-swap-two-variables-without-a-temporary)
   7. [Count the set bits (popcount)](#7-count-the-set-bits-popcount)
   8. [Isolate the lowest set bit](#8-isolate-the-lowest-set-bit)
   9. [Find the unique element with XOR](#9-find-the-unique-element-with-xor)
   10. [Enumerate all subsets with a bitmask](#10-enumerate-all-subsets-with-a-bitmask)
3. [Common pitfalls](#common-pitfalls)
4. [Cheat sheet](#cheat-sheet)
5. [Built-in functions worth knowing](#built-in-functions-worth-knowing)
6. [Practice problems](#practice-problems)

---

## Quick refresher: the bitwise operators

Bits are numbered **from the right, starting at 0**. In `10110`, bit 0 is `0`, bit 1 is `1`, bit 2 is `1`, bit 3 is `0`, bit 4 is `1`.

| Operator | Name | Rule | Example (`6 = 0110`, `3 = 0011`) |
|---|---|---|---|
| `a & b` | AND | 1 only if both bits are 1 | `6 & 3 = 0010 = 2` |
| `a \| b` | OR | 1 if at least one bit is 1 | `6 \| 3 = 0111 = 7` |
| `a ^ b` | XOR | 1 if the bits differ | `6 ^ 3 = 0101 = 5` |
| `~a` | NOT | flips every bit | `~6 = ...11111001 = -7` |
| `a << k` | left shift | moves bits left, fills with 0 | `3 << 2 = 1100 = 12` |
| `a >> k` | right shift | moves bits right | `12 >> 2 = 0011 = 3` |

Three XOR facts power many tricks:

- `a ^ a = 0` (a number cancels itself)
- `a ^ 0 = a` (zero changes nothing)
- XOR is commutative and associative, so the order never matters

---

## The 10 tricks

### 1. Check if a number is even or odd

Instead of the modulo operator (`x % 2`), look at the **least significant bit (LSB)**. Every power of two except `2^0` is even, so the only bit that decides odd or even is bit 0.

```cpp
bool isOdd  = (x & 1) == 1;   // or simply: x & 1
bool isEven = (x & 1) == 0;   // or simply: !(x & 1)
```

**Example:** `13 = 1101`, LSB is `1`, so it is odd. `12 = 1100`, LSB is `0`, so it is even.

> **Warning: operator precedence.** In C and C++, `==` binds *tighter* than `&`. So `x & 1 == 0` is parsed as `x & (1 == 0)`, which is `x & 0`, which is always `0`. That means a check written without brackets will say every number is "not even". Always write `(x & 1) == 0` with brackets.

Works correctly for negative numbers too, because two's complement keeps the LSB meaning (`-3 & 1 = 1`).

---

### 2. Check if a number is a power of two

A power of two has **exactly one** set bit. Subtracting 1 flips that bit to 0 and turns every bit below it into 1, so the two numbers share no set bits.

```
x     = 1000   (8)
x - 1 = 0111   (7)
x & (x-1) = 0000
```

```cpp
bool isPowerOfTwo(long long x) {
    return x > 0 && (x & (x - 1)) == 0;
}
```

**Edge case:** `x = 0` would also give `0 & -1 = 0`, so the `x > 0` check is required. Negative numbers must also be excluded.

**Time:** O(1).

---

### 3. Manipulate the k-th bit

`1 << k` builds a **mask** with only bit `k` set. Combine it with the right operator:

| Goal | Expression | Why it works |
|---|---|---|
| Check if bit k is set | `(x >> k) & 1` or `x & (1LL << k)` | AND keeps only bit k |
| Set bit k to 1 | `x \| (1LL << k)` | OR forces the bit to 1 |
| Clear bit k to 0 | `x & ~(1LL << k)` | `~mask` has 0 only at bit k |
| Toggle bit k | `x ^ (1LL << k)` | XOR with 1 flips the bit |

**Example:** `x = 10110`, `k = 2`

```
mask        = 00100
check       : x & mask  = 00100  (non-zero -> bit is set)
toggle      : x ^ mask  = 10010
set         : x | mask  = 10110  (already set, unchanged)
clear       : x & ~mask = 10010
```

```cpp
bool isSet = (x >> k) & 1;       // gives exactly 0 or 1
x |=  (1LL << k);                // set
x &= ~(1LL << k);                // clear
x ^=  (1LL << k);                // toggle
```

> **Note:** `x & (1 << k)` returns `1 << k`, not `1`. It is non-zero when the bit is set, so use it as a condition (`if (x & (1LL << k))`) or compare with `!= 0`. Do not compare it with `== 1`, which only works for `k = 0`.

---

### 4. Fast multiplication and division by 2^k

Shifting left by `k` multiplies by `2^k`. Shifting right by `k` divides by `2^k` and drops the remainder.

```cpp
int a = x << k;   // x * 2^k
int b = x >> k;   // floor(x / 2^k)
```

**Example:** `45 >> 3 = 5` because `45 / 8 = 5` (remainder dropped). `45 << 3 = 360 = 45 * 8`.

> **Negative numbers:** `>>` rounds toward negative infinity, while `/` truncates toward zero.
> `-45 >> 3 = -6`, but `-45 / 8 = -5`. Use shifts only on non-negative numbers (or unsigned types) unless you want the floor behaviour.

> **Overflow:** if `x << k` does not fit in the type, the result is wrong (and for signed `int`, left-shifting into the sign bit is undefined behaviour in older standards). Use `long long` when values get large.

---

### 5. Efficient modulo by 2^k

`x mod 2^k` is just the **lowest k bits** of `x`. A mask with `k` ones keeps those bits and clears the rest.

```cpp
int r = x & ((1 << k) - 1);   // x % 2^k
```

**Example:** `45 mod 8`, with `k = 3`

```
45          = 101101
mask (8-1)  = 000111
45 & 7      = 000101 = 5
```

The same thing works for the common special case `x % 2` as `x & 1`.

> **Negative numbers:** `-45 & 7 = 3`, but `-45 % 8 = -5` in C++. The bitwise version gives the mathematically "positive" remainder, which is often what you want for hashing and wrap-around indexing, but it is not the same as `%`.

This only works when the divisor is a **power of two**. For any other modulus (like `1e9+7`) there is no bit trick.

---

### 6. Swap two variables without a temporary

```cpp
x = x ^ y;
y = x ^ y;   // (x ^ y) ^ y = x   -> y now holds the original x
x = x ^ y;   // (x ^ y) ^ x = y   -> x now holds the original y
```

**Trace** (`x = 5 = 0101`, `y = 9 = 1001`):

| Step | x | y |
|---|---|---|
| start | 0101 | 1001 |
| `x ^= y` | 1100 | 1001 |
| `y ^= x` | 1100 | 0101 |
| `x ^= y` | 1001 | 0101 |

After the three steps `x = 9` and `y = 5`.

> **Do not use this in real code.** It is a nice puzzle, but `std::swap(x, y)` is just as fast (the compiler optimises it) and far more readable.
> It also **breaks when both names refer to the same memory**. For example `swap(a[i], a[i])` with the XOR version sets `a[i]` to `0`, because `x ^ x = 0`.

---

### 7. Count the set bits (popcount)

**Method A: Brian Kernighan's algorithm.** `x & (x - 1)` removes the lowest set bit. Repeat until `x` becomes 0; the number of repeats is the popcount. It runs once per set bit, not once per bit position.

```cpp
int popcount(unsigned int x) {
    int count = 0;
    while (x) {
        x &= (x - 1);
        count++;
    }
    return count;
}
```

**Trace** (`x = 101101`, popcount is 4):

```
101101 -> 101100 -> 101000 -> 100000 -> 000000
 step1     step2     step3     step4
```

**Method B: the compiler built-in.** Fastest option, usually a single CPU instruction.

```cpp
int a = __builtin_popcount(x);       // 32-bit
int b = __builtin_popcountll(x);     // 64-bit
```

**Time:** O(number of set bits) for Kernighan, O(1) for the built-in.

---

### 8. Isolate the lowest set bit

`x & -x` keeps only the lowest set bit of `x` and clears everything else. In two's complement, `-x = ~x + 1`, which flips every bit above the lowest set bit but leaves that bit (and the zeros below it) the same.

```
x    = 101100
-x   = 010100
x&-x = 000100   (= 4)
```

```cpp
int lowbit = x & -x;
```

This is the heart of the **Fenwick tree (Binary Indexed Tree)**, where `i += i & -i` moves to the next node and `i -= i & -i` moves to the parent.

**Related tricks built from the same idea:**

| Goal | Expression |
|---|---|
| Clear the lowest set bit | `x & (x - 1)` |
| Index of the lowest set bit | `__builtin_ctz(x)` (x must be non-zero) |
| Set all bits below the lowest set bit | `x \| (x - 1)` |

---

### 9. Find the unique element with XOR

If every number in an array appears **twice** except one, XOR-ing the whole array leaves the unique number, because every pair cancels (`a ^ a = 0`) and `0 ^ u = u`.

```cpp
int findSingle(const vector<int>& nums) {
    int result = 0;
    for (int v : nums) result ^= v;
    return result;
}
```

**Example:** `[4, 1, 2, 1, 2]`

```
4 ^ 1 ^ 2 ^ 1 ^ 2 = 4 ^ (1 ^ 1) ^ (2 ^ 2) = 4 ^ 0 ^ 0 = 4
```

**Time:** O(n). **Extra space:** O(1). Compare that with a hash set (O(n) space) or sorting (O(n log n) time).

The same idea finds a **missing number** in `0..n`: XOR all the indices and all the values together.

---

### 10. Enumerate all subsets with a bitmask

A set of `n` items can be encoded as an `n`-bit integer: bit `i` is 1 if item `i` is in the subset. Looping from `0` to `2^n - 1` visits **every** subset exactly once.

```cpp
vector<int> items = {1, 2, 3};
int n = items.size();

for (int mask = 0; mask < (1 << n); mask++) {
    // build the subset described by 'mask'
    for (int i = 0; i < n; i++) {
        if (mask & (1 << i)) {
            // items[i] is in this subset
        }
    }
}
```

**Example:** for `{a, b, c}`

| mask | binary | subset |
|---|---|---|
| 0 | 000 | {} |
| 1 | 001 | {a} |
| 2 | 010 | {b} |
| 3 | 011 | {a, b} |
| 4 | 100 | {c} |
| 5 | 101 | {a, c} |
| 6 | 110 | {b, c} |
| 7 | 111 | {a, b, c} |

**Time:** O(2^n * n). It is practical up to about `n = 20`.

**Iterate over submasks of a mask** (used in subset-sum style and bitmask DP):

```cpp
for (int sub = mask; sub > 0; sub = (sub - 1) & mask) {
    // 'sub' is a non-empty submask of 'mask'
}
// handle sub = 0 (the empty subset) separately if you need it
```

---

## Common pitfalls

| Pitfall | What goes wrong | Fix |
|---|---|---|
| **Operator precedence** | `x & 1 == 0` is read as `x & (1 == 0)`, which is always 0 | Always bracket: `(x & 1) == 0` |
| **`1 << k` overflows** | `1` is an `int`, so `1 << 35` is wrong or undefined | Use `1LL << k` for 64-bit masks |
| **Negative numbers with `>>`** | Rounds toward negative infinity, unlike `/` | Use shifts on non-negative or unsigned values |
| **Negative numbers with `& mask`** | Gives a positive remainder, unlike `%` | Know which behaviour you want |
| **Power-of-two check on 0** | `0 & (0 - 1) == 0` looks like a power of two | Add `x > 0` |
| **XOR swap on the same variable** | `swap(a[i], a[i])` zeroes the value | Use `std::swap` |
| **Checking a bit with `== 1`** | `x & (1 << k)` is `1 << k`, not `1` | Compare with `!= 0` or use `(x >> k) & 1` |
| **Shifting by too much** | Shifting by `>=` the type width is undefined | Keep `k` below the bit width |
| **Signed `~`** | `~x` on a signed value gives a negative number | Mask the result or use unsigned types |

**A note on speed:** for constants (like `x % 2` or `x / 8`) modern compilers already turn the arithmetic into bit operations for you, so the *speed* gain is often zero. The real value of these tricks is in (a) bitmasks that pack many flags into one integer, (b) operations like popcount and lowbit that have no cheap arithmetic equivalent, and (c) compact, loop-free logic.

---

## Cheat sheet

| Task | Code |
|---|---|
| Is `x` odd? | `(x & 1) == 1` |
| Is `x` even? | `(x & 1) == 0` |
| Is `x` a power of two? | `x > 0 && (x & (x - 1)) == 0` |
| Is bit `k` set? | `(x >> k) & 1` |
| Set bit `k` | `x \| (1LL << k)` |
| Clear bit `k` | `x & ~(1LL << k)` |
| Toggle bit `k` | `x ^ (1LL << k)` |
| `x * 2^k` | `x << k` |
| `x / 2^k` (non-negative) | `x >> k` |
| `x % 2^k` (non-negative) | `x & ((1LL << k) - 1)` |
| Swap `x` and `y` | `x ^= y; y ^= x; x ^= y;` (prefer `swap`) |
| Count set bits | `__builtin_popcount(x)` |
| Lowest set bit | `x & -x` |
| Clear lowest set bit | `x & (x - 1)` |
| Unique element in pairs | XOR everything |
| All subsets of `n` items | `for (mask = 0; mask < (1 << n); mask++)` |
| Opposite signs? | `(a ^ b) < 0` |
| Floor of log2(x) | `31 - __builtin_clz(x)` (x > 0, 32-bit) |

---

## Built-in functions worth knowing

These are GCC/Clang built-ins. Add `ll` at the end for 64-bit versions (for example `__builtin_popcountll`).

| Function | Returns |
|---|---|
| `__builtin_popcount(x)` | Number of set bits |
| `__builtin_clz(x)` | Number of leading zeros (undefined for `x = 0`) |
| `__builtin_ctz(x)` | Number of trailing zeros (undefined for `x = 0`) |
| `__builtin_parity(x)` | 1 if the number of set bits is odd, else 0 |
| `std::popcount(x)` (C++20, `<bit>`) | Portable popcount |
| `std::bit_width(x)` (C++20, `<bit>`) | Number of bits needed to represent `x` |

---

## Practice problems

Try these in roughly this order:

| Problem | Trick used |
|---|---|
| LeetCode 231, Power of Two | Trick 2 |
| LeetCode 191, Number of 1 Bits | Trick 7 |
| LeetCode 338, Counting Bits | Tricks 7 and 8 (DP over `x & (x - 1)`) |
| LeetCode 136, Single Number | Trick 9 |
| LeetCode 268, Missing Number | Trick 9 |
| LeetCode 78, Subsets | Trick 10 |
| LeetCode 190, Reverse Bits | Tricks 3 and 4 |
| LeetCode 201, Bitwise AND of Numbers Range | Shifts and common prefix |

---

## License

Free to use for learning and for your own notes.
