package com.LeetCodeJack.Problems;

public class P28_Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0 || haystack == null || needle == null)
            return -1;

        char[] stackArr = haystack.toCharArray();
        int n1=stackArr.length;
        char[] needleArr = needle.toCharArray();
        int n2=needleArr.length;
        int result = -1;
        boolean flag = true;

        for (int i = 0; i < n1+1-n2; i++) {
            if(stackArr[i] == needleArr[0] && stackArr[i+n2-1] == needleArr[n2-1]){
                for(int j=0;j<n2;j++){
                    if(stackArr[i+j] != needleArr[j]){
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if(flag){
                    result = i;
                    return result;
                }
            }
        }

        return result;
    }
}
