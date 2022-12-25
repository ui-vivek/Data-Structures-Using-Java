package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Build_Using_PreOrder_PostOrder {
	public static void print_tree(binary_tree<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<binary_tree<Integer>> que = new LinkedList<binary_tree<Integer>>();
		que.add(root);
		while (!que.isEmpty()) {
			binary_tree<Integer> rootNode = que.poll();
			System.out.print(rootNode.data + ":");
			if (rootNode.left != null) {
				System.out.print("L:" + rootNode.left.data + ",");
				que.add(rootNode.left);
			} else {
				System.out.print("L:" + -1 + ",");
			}
			if (rootNode.right != null) {
				System.out.print("R:" + rootNode.right.data);
				que.add(rootNode.right);
			} else {
				System.out.print("R:" + -1);
			}
			System.out.println();
		}
	}

	public static binary_tree<Integer> build_tree_helper(int[] Post, int[] In, int siPost, int ePost, int siIn,
			int eIn) {

		if (siPost > ePost) {
			return null;
		}
		int rootData = Post[ePost];
		binary_tree<Integer> root = new binary_tree<Integer>(rootData);

		int InRootIndex = -1;
		for (int i = siIn; i <= eIn; i++) {
			if (In[i] == rootData) {
				InRootIndex = i;
				break;
			}
		}

		int siPostLeft = siPost;
		int siInLeft = siIn;
		int eInLeft = InRootIndex - 1;
		int ePostRight = ePost - 1;
		int siInRight = InRootIndex + 1;
		int eInRight = eIn;
		int lengthOfLeft_inOrder = eInLeft - siInLeft;
		int ePostLeft = siPostLeft + lengthOfLeft_inOrder;
		int siPostRight = ePostLeft + 1;
		binary_tree<Integer> left = build_tree_helper(Post, In, siPostLeft, ePostLeft, siInLeft, eInLeft);
		binary_tree<Integer> right = build_tree_helper(Post, In, siPostRight, ePostRight, siInRight, eInRight);
		root.left = left;
		root.right = right;
		return root;
	}

	public static binary_tree<Integer> build_tree(int Post[], int In[]) {

		binary_tree<Integer> root = build_tree_helper(Post, In, 0, Post.length - 1, 0, In.length - 1);
		return root;
	}

	public static void main(String[] args) {
		int Post[] = { 2, 9, 3, 6, 10, 5 };
		int In[] = { 2, 6, 3, 9, 5, 10 };

		binary_tree<Integer> root = build_tree(Post, In);
		print_tree(root);
	}

}
