package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

class nodeInfo {
	int size; // Size of subtree
	int max; // Min value in subtree
	int min; // Max value in subtree
	boolean isBST; // If subtree is BST

	nodeInfo() {
	}

	nodeInfo(int size, int max, int min, boolean isBST) {
		this.size = size;
		this.max = max;
		this.min = min;
		this.isBST = isBST;
	}
}

public class Largest_BST {
	public static nodeInfo largestBST(binary_tree<Integer> root) {
		if (root == null) {
			return new nodeInfo(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
		}
		nodeInfo left = largestBST(root.left);
		nodeInfo right = largestBST(root.right);
		nodeInfo returnInfo = new nodeInfo();

		returnInfo.min = Math.min(left.min, root.data);
		returnInfo.max = Math.max(right.max, root.data);
		returnInfo.isBST = left.isBST && right.isBST && root.data > left.max && root.data < right.min;
		if (returnInfo.isBST)

			returnInfo.size = Math.max(left.size, right.size) + 1;
		else
			returnInfo.size = Math.max(left.size, right.size);

		return returnInfo;
	}

	public static int largestBst(binary_tree<Integer> root) {
		return largestBST(root).size;
	}

	public static void print_tree(binary_tree<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L:" + root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print("R:" + root.right.data);
		}
		System.out.println();
		print_tree(root.left);
		print_tree(root.right);

	}

	public static binary_tree<Integer> create_tree(int arr[]) {
		int start = 0;
		int inputData = arr[start];
		if (inputData == -1) {
			return null;
		}
		binary_tree<Integer> root = new binary_tree<>(inputData);
		Queue<binary_tree<Integer>> que = new LinkedList<binary_tree<Integer>>();
		que.add(root);

		while (!que.isEmpty()) {
			binary_tree<Integer> RootNode = que.poll();
			int leftNode = arr[++start];
			if (leftNode != -1) {
				binary_tree<Integer> leftchild = new binary_tree<Integer>(leftNode);
				RootNode.left = leftchild;
				que.add(leftchild);
			}
			int rightNode = arr[++start];
			if (rightNode != -1) {
				binary_tree<Integer> rightchild = new binary_tree<Integer>(rightNode);
				RootNode.right = rightchild;
				que.add(rightchild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 6, 1, 3, 5, 7, -1, -1, -1, -1, -1, -1, -1, -1 };
		binary_tree<Integer> root = create_tree(arr);
		System.out.print("Size of the largest BST is " + largestBst(root) + "\n");
	}
}