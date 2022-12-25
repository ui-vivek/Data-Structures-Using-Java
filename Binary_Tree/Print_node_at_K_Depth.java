package Binary_Tree;

class K_depth<T> {
	T data;
	K_depth<T> left;
	K_depth<T> right;

	K_depth(T data) {
		this.data = data;
	}
}

public class Print_node_at_K_Depth {

	public static void printTree(K_depth<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.print(root.data + " ");
			return; // because no need to go down after that
		}
		printTree(root.left, k - 1);
		printTree(root.right, k - 1);
		return;
	}

	public static void main(String[] args) {
//	           1
//		     /   \
//	        2     3
//	        \     /
//			 4   5
		K_depth<Integer> root = new K_depth<>(10);
		K_depth<Integer> root_left = new K_depth<>(2);
		K_depth<Integer> root_right = new K_depth<>(3);

		root.left = root_left;
		root.right = root_right;

		K_depth<Integer> root_left_right = new K_depth<>(4);
		K_depth<Integer> root_right_left = new K_depth<>(5);
		root_left.right = root_left_right; // See the diagram above to understand.
		root_right.left = root_right_left;
//		----------------------------------------------- 
		printTree(root, 2); // print all elements at the K_depth// at that label.

	}
}
