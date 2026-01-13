An anagram is a word or phrase formed by rearranging the letters of a 
different word or phrase, typically using all the original letters exactly once.

```
1. isAnagram() method:

Time Complexity: O(n)

First loop: O(n) - iterates through both strings once	
Second loop: O(128) = O(1) - constant, checks fixed array size	
Total: O(n) where n is the length of the strings	


Space Complexity: O(1)	

Uses fixed array of size 128 regardless of input size	
O(128) = O(1) - constant space
```

```
2. isAnagramJava() method:

This method purely relies on Java methods unlike isAnagram().

Time Complexity: O(n log n)

Converting to char arrays: O(n)	
Sorting both arrays: O(n log n) - dominant operation	
Comparing arrays: O(n)	
Total: O(n log n)	


Space Complexity: O(n)	

Two char arrays of size n	
Sorting may use additional O(log n) space for recursion stack	
Total: O(n)
```

---


How the loop works (isAnagram()):

First, it checks for the length of the given strings, and compare.

Then, within the loop, it becomes this:	

This is how I virtualized how increment / decrement happen in the loop.

| i | first[i] | second[i] | Update in array            | What happens               |
| - | -------- | --------- | -------------------------- | -------------------------- |
| 0 | l        | s         | count['l']++, count['s']-- | {l=1, s=-1}                |
| 1 | i        | i         | count['i']++, count['i']-- | {l=1, s=-1}                |
| 2 | s        | l         | count['s']++, count['l']-- | {}                         |
| 3 | t        | e         | count['t']++, count['e']-- | {t=1, e=-1}                |
| 4 | e        | n         | count['e']++, count['n']-- | {t=1, n=-1}                |
| 5 | n        | t         | count['n']++, count['t']-- | {}                         |

Finally if the count is zero, then the strings are considered to be anagrams.
