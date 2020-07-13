package com.LeetCodeJack.Problems;

public class P744_FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters.length == 1)
            return letters[0];

        int x = target;
        int left = 0;
        int right = letters.length -1;
        int mid = 0;
        int res;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (letters[mid] == target) {
                left = mid;
                break;
            } else if (letters[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        while(mid + 1 <= letters.length - 1 && letters[mid] == letters[mid + 1]){
            mid++;
        }

        if (target - letters[mid] >= 0)
            res = mid + 1;
        else
            res = mid;

        return (res >= letters.length) ? letters[0] : letters[res];
    }
}
