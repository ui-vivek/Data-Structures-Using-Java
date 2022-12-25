package Tree;

public class First_Tree {
	public static int nodecount(Tree<Integer> root) {

		int count = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int child_count = nodecount(root.children.get(i));
			count = count + child_count;
		}
		return count;
	}

	public static void print_tree(Tree<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for (int i = 0; i < root.children.size(); i++) {
			Tree<Integer> child = root.children.get(i);
			print_tree(child);

		}
	}

	public static void main(String[] args) {
		Tree<Integer> root = new Tree<>(1);
		Tree<Integer> node1 = new Tree<>(2);
		Tree<Integer> node2 = new Tree<>(3);
		Tree<Integer> node3 = new Tree<>(4);
		Tree<Integer> node4 = new Tree<>(5);
		Tree<Integer> node5 = new Tree<>(6);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);

		node1.children.add(node4);
		node1.children.add(node5);

		print_tree(root);
		System.out.println("Sum of all nodes are : " + nodecount(root));
	}

}
