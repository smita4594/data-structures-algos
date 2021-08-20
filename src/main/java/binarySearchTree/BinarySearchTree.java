package binarySearchTree;

public class BinarySearchTree {

	class Node {
		int key;
		Node left;
		Node right;

		public Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	public Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	public void inorderRec(Node root) {
		if (root == null) {
			return;
		}
		inorderRec(root.left);
		System.out.println(root.key);
		inorderRec(root.right);
	}

	public boolean search(int key) {
		return searchRec(root, key);
	}

	public boolean searchRec(Node root, int key) {
		if (root == null)
			return false;
		if (root != null && root.key == key)
			return true;
		else if (root != null && key < root.key)
			searchRec(root.left, key);
		else if (root != null && key > root.key)
			searchRec(root.right, key);
		return false;
	}

	public void delete(int key) {
		root = deleteRec(root, key);
	}

	public Node deleteRec(Node root, int key) {
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			else {
				Node succ = getSucc(root);
				root.key = succ.key;
				root.right = deleteRec(root.right, succ.key);
			}
		}
		return root;
	}

	public Node getSucc(Node root) {
		Node curr = root.right;
		while (curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(4);
		bst.insert(6);
		bst.inorder();
		System.out.println(bst.search(3));
		System.out.println();
		bst.delete(6);
		bst.inorder();
	}
}