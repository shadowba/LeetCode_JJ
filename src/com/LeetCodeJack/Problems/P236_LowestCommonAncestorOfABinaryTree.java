package com.LeetCodeJack.Problems;
import com.EssentialClasses.TreeNode;

import java.util.*;

public class P236_LowestCommonAncestorOfABinaryTree {
    List<TreeNode> PList = new ArrayList<>();
    List<TreeNode> QList = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        getFather(p.val, root, PList);
        getFather(q.val, root, QList);
        for(int i = 0; i<PList.size(); i++){
            for(int j = 0; j<QList.size(); j++){
                if(PList.get(i).val == QList.get(j).val)
                    return QList.get(j);
            }
        }
        return root;
    }
    private boolean getFather(int target, TreeNode cur, List<TreeNode> fartherList){
        if(cur == null)
            return false;
        if(cur.val == target){
            fartherList.add(cur);
            return true;
        }

        if(getFather(target, cur.left, fartherList)==true){
            fartherList.add(cur);
            return true;
        }
        if(getFather(target, cur.right, fartherList)==true){
            fartherList.add(cur);
            return true;
        }
        return false;
    }
}
