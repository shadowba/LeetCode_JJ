package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P752_OpenTheLock;

public class test752_OpenTheLock {
    public static void main(String[] args) {
        String[] deadEnds = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        P752_OpenTheLock tester = new P752_OpenTheLock();
        tester.openLock(deadEnds,target);
    }
}
