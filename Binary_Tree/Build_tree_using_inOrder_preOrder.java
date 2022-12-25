package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Build_tree_using_inOrder_preOrder {

	public static void print_level_wise(binary_tree<Integer> root) {
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
				System.out.print("L:" + -1);

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

	public static binary_tree<Integer> build_tree_Helper(int[] In, int[] Pre, int siPre, int ePre, int siIn, int eIn) {
		if (siPre > ePre) {
			return null;
		}
		int rootElement = Pre[siPre];
		binary_tree<Integer> root = new binary_tree<Integer>(rootElement);

		int rootIndex = -1;
		for (int i = siIn; i <= eIn; i++) {
			if (rootElement == In[i]) {
				rootIndex = i;
				break;
			}
		}
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eInLeft = rootIndex - 1;
		int ePreRight = ePre;
		int siInright = rootIndex + 1;
		int eInRight = eIn;

		int subTreeLenght = eInLeft - siInLeft;

		int ePreLeft = siPreLeft + subTreeLenght;
		int siPreRight = ePreLeft + 1;

		binary_tree<Integer> left = build_tree_Helper(In, Pre, siPreLeft, ePreLeft, siInLeft, eInLeft);
		binary_tree<Integer> right = build_tree_Helper(In, Pre, siPreRight, ePreRight, siInright, eInRight);
		root.left = left;
		root.right = right;
		return root;
	}

	public static binary_tree<Integer> build_tree(int In[], int Pre[]) {
		binary_tree<Integer> root = build_tree_Helper(In, Pre, 0, In.length - 1, 0, Pre.length - 1);
		return root;
	}

	public static void main(String[] args) {
		int In[] = { 4, 2, 5, 1, 6, 3, 7 };
		int Pre[] = { 1, 2, 4, 5, 3, 6, 7 };
		binary_tree<Integer> root = build_tree(In, Pre);
		print_level_wise(root);
	}

}
