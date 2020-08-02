package com.LeetCodeJack.Problems2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P71_M_SimplifyPath {
    public String simplifyPath(String path) {
        String[] p = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0; i<p.length; i++){
            if(!stack.isEmpty() && p[i].equals(".."))
                stack.pop();
            else if(!p[i].equals("")&&!p[i].equals(".")&&!p[i].equals(".."))
                stack.push(p[i]);
        }
        List<String> list = new ArrayList<>(stack);
        String s ="/" + String.join("/",list);
        return s;
    }
}
//    public String simplifyPath(String path) {
//        Stack<Character> chStack = new Stack<>();
//        int N= path.length();
//        char ch = ' ';
//        for(int i = 0; i< N; i++){
//            ch = path.charAt(i);
//            switch(ch){
//                case '/':
//                    if(chStack.isEmpty()){
//                        chStack.push(ch);
//                        break;
//                    }
//                    else if(chStack.peek() == '/')
//                        break;
//                    else if(chStack.peek() == '.'){
//                        chStack.pop();
//                        break;
//                    }
//                    chStack.push(ch);
//                    break;
//                case '.':
//                    if(chStack.isEmpty() || chStack.peek()!='.'){
//                        chStack.push(ch);
//                    }
//                    else if(chStack.peek() == '.' && chStack.size()>=3){
//                        for(int j=0; j<3;j++)
//                            chStack.pop();
//                    }
//                    else if(chStack.peek() == '.' && chStack.size()< 3){
//                        chStack.pop();
//                    }
//                    break;
//                default:
//                    chStack.push(ch);
//                    break;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while(!chStack.isEmpty())
//            sb.insert(0,chStack.pop());
//        while(sb.length() > 1 && sb.charAt(sb.length()-1)=='/'||){
//
//        }
//        sb.deleteCharAt(sb.length()-1);
//        return sb.toString();
//    }
