package com.LeetCodeJack.Problems;

import java.util.ArrayList;
import java.util.List;

public class P17_LetterCombinationsOfPhoneNumber {
//    char[] numbers={'2','3','4','5','6','7','8','9'};
    char[][] alphabetTable={{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
            {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public List<String> letterCombinations(String digits) {
        StringBuilder str=new StringBuilder();
        char[] digitsArr=digits.toCharArray();
        List<String> result=new ArrayList<>();
        if(digits.length()==0||digits==null)
            return result;

        dfsRecursive(digitsArr,result,str,0);
        return result;
    }

    private void dfsRecursive(char[] digitsArr, List<String> result, StringBuilder str, int currentLayer){
        if(currentLayer==digitsArr.length-1){
            char[] charTable=alphabetTable[digitsArr[currentLayer]-'2'];
            for(char ch:charTable){
                str.append(ch);
                result.add(str.toString());
                str.deleteCharAt(currentLayer);
            }
            return;
        }
        char[] charTable=alphabetTable[digitsArr[currentLayer]-'2'];
        for(char ch:charTable){
            str.append(ch);
            dfsRecursive(digitsArr,result,str,currentLayer+1);
            str.deleteCharAt(currentLayer);
        }
    }
}
