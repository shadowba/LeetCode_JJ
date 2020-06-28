package com.LeetCodeJack.Problems;

public class P4_MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

//        Exchange the position, always make sure the nums1 is shorter than nums2
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);


        int partitionX;
        int partitionY;
        int maxLeftX;
        int maxLeftY;
        int minRightX;
        int minRightY;
        int low = 0;
        int high = n1;

        while (low <= high) {
            partitionX = (low + high) / 2;
            partitionY = (n1 + n2 + 1) / 2 - partitionX;

            if (partitionX == 0)
                maxLeftX = Integer.MIN_VALUE;
            else
                maxLeftX = nums1[partitionX - 1];

            if (partitionX == n1)
                minRightX = Integer.MAX_VALUE;
            else
                minRightX = nums1[partitionX];

            if (partitionY == 0)
                maxLeftY = Integer.MIN_VALUE;
            else
                maxLeftY = nums2[partitionY - 1];

            if (partitionY == n2)
                minRightY = Integer.MAX_VALUE;
            else
                minRightY = nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX){
                if ((n1 + n2) % 2 == 0)
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightY, minRightX)) / 2;
                else
                    return (double) Math.max(maxLeftX, maxLeftY);
            }

                else if (maxLeftX > minRightY)
                    high = partitionX - 1;
                else
                    low = partitionX + 1;
        }

        throw new IllegalArgumentException();
    }

}
