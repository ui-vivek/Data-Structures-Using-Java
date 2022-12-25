package Binary_Tree;

class F_BinaryTree<T> {
	T data;
	F_BinaryTree<T> left;
	F_BinaryTree<T> right;

	F_BinaryTree(T data) {
		this.data = data;
	}
}

public class First_Binary_Tree {

	public static void printTree(F_BinaryTree<Integer> root) {
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

	public static void main(String[] args) {
//            1
//	        /   \
//         2     3
//         \     /
//		    4   5
		F_BinaryTree<Integer> root = new F_BinaryTree<>(1);
		F_BinaryTree<Integer> root_left = new F_BinaryTree<>(2);
		F_BinaryTree<Integer> root_right = new F_BinaryTree<>(3);

		root.left = root_left;
		root.right = root_right;

		F_BinaryTree<Integer> root_left_right = new F_BinaryTree<>(4);
		F_BinaryTree<Integer> root_right_left = new F_BinaryTree<>(5);
		root_left.right = root_left_right; // See the diagram above to understand.
		root_right.left = root_right_left;

		printTree(root);

	}
}
