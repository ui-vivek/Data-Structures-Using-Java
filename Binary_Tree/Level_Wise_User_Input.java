package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Wise_User_Input {

	public static void printTree(binary_tree<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print(" L" + root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print(" R" + root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}

	public static binary_tree<Integer> create_tree_level_wise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Root");
		int inputData = s.nextInt();
		if (inputData == -1) {
			return null;
		}
		binary_tree<Integer> root = new binary_tree<>(inputData);
		Queue<binary_tree<Integer>> que = new LinkedList<binary_tree<Integer>>();
		que.add(root);

		while (!que.isEmpty()) {
			binary_tree<Integer> RootNode = que.poll();
			System.out.println("Enter The Left Child Of " + RootNode.data);
			int leftNode = s.nextInt();
			if (leftNode != -1) {
				binary_tree<Integer> leftchild = new binary_tree<Integer>(leftNode);
				RootNode.left = leftchild;
				que.add(leftchild);
			}
			System.out.println("Enter The Right Child Of " + RootNode.data);
			int rightNode = s.nextInt();
			if (rightNode != -1) {
				binary_tree<Integer> rightchild = new binary_tree<Integer>(rightNode);
				RootNode.right = rightchild;
				que.add(rightchild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		binary_tree<Integer> root = create_tree_level_wise();
		printTree(root);
	}

}
