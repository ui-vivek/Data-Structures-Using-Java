package Binary_Tree;

class Find_leaf<T> {
	T data;
	Find_leaf<T> left;
	Find_leaf<T> right;

	Find_leaf(T data) {
		this.data = data;
	}
}

public class Find_LeafNode {

	public static int printTree(Find_leaf<Integer> root) { // print the number of all leaf nodes in the BT.
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int LHS = printTree(root.left);
		int RHS = printTree(root.right);
		return LHS + RHS;
	}

	public static void main(String[] args) {
//		            1
//			      /   \
//		         2     3
//		         \     /
//				  4   5
		Find_leaf<Integer> root = new Find_leaf<>(10);
		Find_leaf<Integer> root_left = new Find_leaf<>(2);
		Find_leaf<Integer> root_right = new Find_leaf<>(3);

		root.left = root_left;
		root.right = root_right;

		Find_leaf<Integer> root_left_right = new Find_leaf<>(4);
		Find_leaf<Integer> root_right_left = new Find_leaf<>(5);
		root_left.right = root_left_right; // See the diagram above to understand.
		root_right.left = root_right_left;

		int re = printTree(root);
		System.out.println(re);

	}
}
