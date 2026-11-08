# Quadratic Equation Roots

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a quadratic equation  **ax2 + bx + c = 0**, find its roots. If the equation has real roots, then return floor value of each root in decreasing order, If the roots are imaginary return  **-1**, the driver code will print  **Imaginary**.

 **Examples:** 

```
Input: a = 1, b = -2, c = 1
Output: [1, 1]
Explanation: Roots of equation x2-2x+1 are 1 and 1.
```

```
Input: a = 1, b = -7, c = 12
Output: [4, 3]
Explanation: Roots of equation x2 - 7x + 12 are 4 and 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T13:59:06.068Z  

```java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        ArrayList<Integer> result = new ArrayList<>();

        double n = (b * b) - (4 * a * c);

        if (n >= 0) {

            double x = (-b + Math.sqrt(n)) / (2.0 * a);
            double y = (-b - Math.sqrt(n)) / (2.0 * a);

            int root1 = (int) Math.floor(Math.max(x, y));
            int root2 = (int) Math.floor(Math.min(x, y));

            result.add(root1);
            result.add(root2);

        } 
        else {
            result.add(-1);
        }

        return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quadratic-equation-roots/1)