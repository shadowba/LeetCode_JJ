package com.LeetCodeJack.Problems2;
import com.EssentialClasses.TreeNode;

import java.util.*;
public class P652_FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, TreeNode> dic = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        helperTree(root, dic, res);
        return res;
    }

    private String helperTree(TreeNode cur, Map<String, TreeNode> dic, List<TreeNode> res){
        if(cur == null){
            return "#";
        }
        String inline = helperTree(cur.left, dic, res) + helperTree(cur.right, dic, res) + cur.val;
        if(!dic.containsKey(inline))
            dic.put(inline,cur);
        else if(dic.containsKey(inline) && !res.contains(dic.get(inline))){
            res.add(dic.get(inline));
        }

        return inline;
    }
}
