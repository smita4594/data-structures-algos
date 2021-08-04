package trees;

public class Runner {
	public static void main(String args[]) {
		Node root = null;
		/*
		 * Node right = new Node(6); Node left = new Node(4); root.left = left;
		 * root.right = right;
		 */
		// inorder(root);
		// preorder(root);
		// postorder(root);
	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key);
		inorder(root.left);
		inorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root.key);
	}

	
}