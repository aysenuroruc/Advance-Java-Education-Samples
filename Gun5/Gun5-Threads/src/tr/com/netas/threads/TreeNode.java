package tr.com.netas.threads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TreeNode {
	 
    int value;
 
    Set<TreeNode> children;
 
    TreeNode(int value, TreeNode ... children) {
        this.value = value;
        this.children = new HashSet<>();
        for(TreeNode n : children)
        {
        	this.children.add(n);
        }
    }
}