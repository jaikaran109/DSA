class Solution {
    int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

// isme jb n * fact(n-1) ho rha hto , isme fact (n-1) call ho rha h

// aur jb vo return hoga n == 1 se to baki sare functions bhi return ho jayenge
// n * fact(n-1) , n = 5
// 5 * fact(4);
// 4 * fact(3)
// 3 * fact(2)
// 2 * fact(1) -- fact(1) return 1;

// ab sara flow dekh lo ek baar kaise chal rha h
