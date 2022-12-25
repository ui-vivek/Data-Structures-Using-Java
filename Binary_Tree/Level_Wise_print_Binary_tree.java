package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Wise_print_Binary_tree {
	public static void print_level_wise(binary_tree<Integer> root) {
		if (root == null) {
			return;
		}

		Queue<binary_tree<Integer>> que = new LinkedList<binary_tree<Integer>>();
		que.add(root);

		while (!que.isEmpty()) {
			binary_tree<Integer> RootNode = que.poll();
			System.out.print(RootNode.data + ":");
			if (RootNode.left != null) {
				System.out.print("L" + RootNode.left.data + ",");
				que.add(RootNode.left);
			} else {
				System.out.print("L" + -1 + ",");
			}
			if (RootNode.right != null) {
				System.out.print("R" + RootNode.right.data);
				que.add(RootNode.right);
			} else {
				System.out.print("R" + -1);
			}
			System.out.println();
		}
	}

	public static binary_tree<Integer> create_tree_level_wise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Root ");
		int inputData = s.nextInt();
		if (inputData == -1) {
			return null;
		}
		binary_tree<Integer> root = new binary_tree<Integer>(inputData);

		Queue<binary_tree<Integer>> que = new LinkedList<binary_tree<Integer>>();
		que.add(root);

		while (!que.isEmpty()) {
			binary_tree<Integer> rootNode = que.poll();
			System.out.println("Enter The Left Child of " + rootNode.data);
			int LeftRootData = s.nextInt();
			if (LeftRootData != -1) {
				binary_tree<Integer> LeftRoot = new binary_tree<Integer>(LeftRootData);
				que.add(LeftRoot);
				rootNode.left = LeftRoot;
			}
			System.out.println("Enter The Right Child Of " + rootNode.data);
			int RightNodeData = s.nextInt();
			if (RightNodeData != -1) {
				binary_tree<Integer> RightNode = new binary_tree<Integer>(RightNodeData);
				que.add(RightNode);
				rootNode.right = RightNode;
			}
		}
		return root;

	}

	public static void main(String[] args) {

		binary_tree<Integer> root = create_tree_level_wise();
		print_level_wise(root);
	}

}
