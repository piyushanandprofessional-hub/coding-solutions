# Last Digit of a^b

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers a and b in the form of strings. Return the last digit of ab.

**Examples:
**

```
Input: a = "3", b = "10"
Output: 9
Explanation: 310 = 59049. Last digit is 9.
```

```
Input: a = "6", b = "2"
Output: 6
Explanation: 62 = 36. Last digit is 6.
```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 1000
a and b consist only of numeric digits ('0' - '9')
a and b do not contain any leading zeros, except when number itself is "0"

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T16:53:58.160Z  

```java

class Solution {
    int getLastDigit(String a, String b) {

        
        if (b.equals("0")) {
            return 1;
        }

        if (a.equals("0")) {
            return 0;
        }

        int lastDigit = a.charAt(a.length() - 1) - '0';

        
        int rem = 0;

        for (int i = 0; i < b.length(); i++) {
            rem = (rem * 10 + (b.charAt(i) - '0')) % 4;
        }

        
        if (rem == 0) {
            rem = 4;
        }

        
        int ans = 1;

        for (int i = 1; i <= rem; i++) {
            ans = (ans * lastDigit) % 10;
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1)