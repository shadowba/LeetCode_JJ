package com.LeetCodeJack.Problems2;
import java.util.*;
public class P89_M_GrayCode {
    public List<Integer> grayCode(int n) {
        // 格雷码 固定公式 i ^ ( i / 2) 也就是 i 异或 （i/2）
        // 1<<n 表示 1 左移 n位 即等于 2的n次方
        List<Integer>  res = new ArrayList<>();
        for(int i = 0; i < (1<<n); i++){
            res.add( i ^ (i / 2));
        }
        return res;
    }
}
