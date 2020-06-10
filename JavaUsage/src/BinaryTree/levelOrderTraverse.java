package BinaryTree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
	}
}

public class levelOrderTraverse {
	public void levelOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		Deque<TreeNode> myqueue = new ArrayDeque<>(); 
		myqueue.offerFirst(root);
		while (!myqueue.isEmpty()) {
			int levelLength = myqueue.size();
			int[] levelNumbers = new int[levelLength];
			for (int i = 0; i < levelLength; i++) {
				TreeNode node = myqueue.pollLast();
				levelNumbers[i] = node.value;
				if (node.left != null) {
					myqueue.offerFirst(node.left);
				}
				if (node.right != null) {
					myqueue.offerFirst(node.right);
				}
			}
			System.out.println(Arrays.toString(levelNumbers));
		}
		
	}
	
	public static void main(String[] args) {
		levelOrderTraverse test = new levelOrderTraverse();
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(3);
		root.right = new TreeNode(5);
		root.left.right = new TreeNode(10);
		root.right.left = new TreeNode(2);
		test.levelOrder(root);
	}

}
