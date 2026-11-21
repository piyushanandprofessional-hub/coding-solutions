# Largest Prime Factor

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, your task is to find the largest prime factor of n.

 **Examples:** 

```
Input: n = 5
Output: 5
Explanation: The prime factorization of 5 is just 5. Therefore, the largest prime factor is 5.
```

```
Input: n = 24
Output: 3
Explanation: The prime factorization of 24 is. Among the prime factors (2, 3), the largest is 3.
```

```
Input: n = 13195
Output: 29
Explanation: The prime factorization of 13195 is. The largest prime factor is 29.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T16:50:04.324Z  

```java
class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int largest = 1;

                for (int i = 2; i <= n / i; i++) {

                    if (n % i == 0) {

                        largest = i;

                        while (n % i == 0) {
                            n = n / i;
                        }
                    }
                }

                if (n > 1) {
                    largest = n;
                }

                return largest;

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-prime-factor2601/1)