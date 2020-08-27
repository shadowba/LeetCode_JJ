package com.LeetCodeJack.Problems3;
import java.util.*;
public class P973_M_KClosestPointsToOrigin {
    class Solution {
        int[][] points;
        int[][] res;
        int N;
        public int[][] kClosest(int[][] points, int K) {
            this.points = points;
            N=points.length;
            res = new int[K][2];
            randomize();
            sort(0,N-1,K);
            return res;
        }

        private void sort(int left, int right, int K){
            int mid=0;
            if(left<=right && left>=0 && right<=N-1)
                mid=partition(left,right);
            else
                return;

            if(mid>=0 && mid<= K-1){
                res[mid][0]=points[mid][0];
                res[mid][1]=points[mid][1];
                sort(mid+1,right,K);
                sort(left,mid-1,K);
            }else
                sort(left,mid-1,K);
        }

        private int partition(int left, int right){
            int pivot = dist(points[right]);
            int slow = left-1;
            int fast = left;
            while(fast<right){
                if(dist(points[fast])<pivot){
                    swap(points[fast],points[slow+1]);
                    slow++;
                    fast++;
                }else
                    fast++;
            }
            swap(points[slow+1],points[right]);
            return slow+1;
        }

        private int dist(int[] pt) {
            return pt[0] * pt[0] + pt[1] * pt[1];
        }

        private void swap(int[] pti, int[] ptj) {
            int tmpx, tmpy;
            tmpx = pti[0];
            tmpy = pti[1];
            pti[0] = ptj[0];
            pti[1] = ptj[1];
            ptj[0] = tmpx;
            ptj[1] = tmpy;
        }

        private void randomize(){
            Random rand = new Random();
            int target=0;
            for(int i=points.length-1; i>=0;i--){
                target = rand.nextInt(i+1);
                swap(points[i],points[target]);
            }
        }
    }
}
