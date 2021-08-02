package trees;

public class Runner {
	public static void main(String args[]) {
		Tree root = new Tree(5);
		Tree right = new Tree(6);
		Tree left = new Tree(4);
		root.left = left;
		root.right = right;
		//inorder(root);
		//preorder(root);
		postorder(root);
	}

	public static void inorder(Tree root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}
	public static void preorder(Tree root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key);
		inorder(root.left);
		inorder(root.right);
	}
	public static void postorder(Tree root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root.key);
	}
}