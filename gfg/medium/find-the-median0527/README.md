# find-the-median0527

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T17:56:49.177Z  

```java
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        int n = arr.length;
                Arrays.sort(arr);

                if(n % 2 != 0) {
                    return arr[n / 2];
                }
                else {
                    return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
                }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-median0527/1)