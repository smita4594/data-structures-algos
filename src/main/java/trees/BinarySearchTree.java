package trees;

public class BinarySearchTree {
	class Node
	{
		int key;
		Node left;
		Node right;
		public Node(int key)
		{
			this.key=key;
			left=null;
			right=null;
		}
	}
	
	Node root;
	BinarySearchTree()
	{
		root=null;
	}
	public void insert(int key)
	{
		root=insertRec(root,key);
	}
	public Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(key<root.key)
		{
			root.left=insertRec(root.left,key);
		}
		else if(key>root.key)
		{
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	void inorder()
    {
         inorderRec(root);
    }
	public  void inorderRec(Node root) {
		if (root == null) {
			return;
		}
		inorderRec(root.left);
		System.out.println(root.key);
		inorderRec(root.right);
	}
	public static void main(String args[])
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(4);
		bst.insert(6);
		bst.inorder();
	}
}