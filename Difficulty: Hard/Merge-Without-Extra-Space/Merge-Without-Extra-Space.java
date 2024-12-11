// User function Template for Java

import java.util.Arrays;

class Solution {
    // Function to swap elements between two arrays
    public static void swp(int[] a, int[] b, int i, int j) {
        int t = a[i];
        a[i] = b[j];
        b[j] = t;
    }
    
    // Function to merge two sorted arrays without extra space
    public void mergeArrays(int a[], int b[]) {
        int n = a.length; // Size of array a
        int m = b.length; // Size of array b
        
        int i = n - 1; // Pointer for the largest element in array a
        int j = 0;     // Pointer for the smallest element in array b
        
        // Step 1: Compare and swap elements between the two arrays
        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                // Swap elements if the element in `a` is larger
                swp(a, b, i, j);
                i--; // Move pointer in array a
                j++; // Move pointer in array b
            } else {
                // No need to swap if already in order
                break;
            }
        }
        
        // Step 2: Sort both arrays to ensure the final result is in non-decreasing order
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

/*
Approach:
1. The function uses a two-pointer technique to compare the largest elements of array `a` with the smallest elements of array `b`.
2. If the largest element in `a` is greater than the smallest element in `b`, they are swapped.
3. After swapping, the pointers are moved inward (decreasing for `a`, increasing for `b`).
4. Once all necessary swaps are done, both arrays are sorted to ensure they are in non-decreasing order.

---

Time Complexity:
1. The swapping loop runs for O(min(n, m)) iterations, where n and m are the lengths of the arrays.
2. Sorting `a` and `b` takes O(n log n) and O(m log m), respectively.

Overall Time Complexity: O(min(n, m)) + O(n log n) + O(m log m)

---

Space Complexity:
- Since the function does not use any extra space apart from the input arrays and a few variables, the space complexity is O(1).

---

Example Usage:
Input:
a[] = [1, 5, 9, 10, 15, 20]
b[] = [2, 3, 8, 13]

Output:
a[] = [1, 2, 3, 5, 8, 9]
b[] = [10, 13, 15, 20]
*/
