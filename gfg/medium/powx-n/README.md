# Implement Pow

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement the function  **power(b, e)**, which calculates  **b**  raised to the power of  **e**  (i.e. be).

 **Examples:** 

```
Input: b = 3.00000, e = 5
Output: 243.00000
```

```
Input: b = 0.55000, e = 3
Output: 0.16638
```

```
Input: b = -0.67000, e = -7
Output: -16.49971
```

 **Constraints:** 

-100.0 < b < 100.0
-109 <= e <= 109
Either b is not zero or e > 0.
-104 <= be <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T18:08:55.951Z  

```java
class Solution {
    double power(double b, int e) {
        // code here
        if(b==1.0)return b;

                if(e==0)return 1.00;
                if(e<0)return 1.0/power(b,-e);

                if(e%2==0) return power(b*b,e/2);
                else return b*power(b,e-1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/powx-n/1)