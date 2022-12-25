package Binary_Tree;

public class Check_isBST {
	public static boolean isBST(binary_tree<Integer> root) {
		if (root == null) {
			return true;
		}
		if (root.left != null) {
			if (root.data < root.left.data) {
				return false;
			}
		}
		if (root.right != null) {
			if (root.data > root.right.data) {
				return false;
			}
		}
		boolean isLeft = isBST(root.left);
		boolean isRight = isBST(root.right);

		if (isLeft && isRight) {
			return true;
		} else {
			return false;
		}
	}

	public static binary_tree<Integer> create_bst(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		binary_tree<Integer> root = new binary_tree<Integer>(arr[mid]);
		root.left = create_bst(arr, start, mid - 1);
		root.right = create_bst(arr, mid + 1, end);
		return root;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4, 4, 5, 6, 7 };
		binary_tree<Integer> root = create_bst(arr, 0, arr.length - 1);
		System.out.println(isBST(root));
	}

}
