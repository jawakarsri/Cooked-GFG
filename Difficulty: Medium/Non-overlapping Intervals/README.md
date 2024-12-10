# [Non-overlapping Intervals](https://www.geeksforgeeks.org/problems/non-overlapping-intervals)

### Difficulty Level: Medium

---

## Problem Statement

Given a 2D array `intervals[][]` representing intervals where `intervals[i] = [startᵢ, endᵢ]`. Return the **minimum number of intervals you need to remove** to make the rest of the intervals non-overlapping.

---

## Examples

**Example 1:**

```text
Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 1
Explanation: [1, 3] can be removed, and the rest of the intervals are non-overlapping.
```
**Example 2:**

```text
Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
Output: 2
Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.
```
**Example 3:**

```text
Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]
Output: 0
Explanation: All ranges are already non-overlapping.
```
