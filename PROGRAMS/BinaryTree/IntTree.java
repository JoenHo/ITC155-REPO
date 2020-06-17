/**
 * 2. Write a method called countEmpty that returns the number of empty 
 * branches in a tree. An empty tree is considered to have one empty
 * branch (the tree itself). For nonempty trees, your methods should count
 * the total number of empty branches among the nodes of the tree. A leaf
 * node has two empty branches, a node with one nonempty child has one
 * empty branch, and a node with two nonempty children has no empty
 * branches. For example, reference tree #1 has 7 empty branches (two
 * under the value 1, one under 5, and two under each of 4 and 6).
 * 
 * @author J.Ho
 *
 */

// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder, or postorder traversal. The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree. The
// documentation refers to these as "sequential trees."

public class IntTree {
	private IntTreeNode overallRoot;

	//--------------------ADD by J.Ho-------------------------
	//
	public int countEmpty() {
		return countEmptyBranches(overallRoot);
	}
	
	public int countEmptyBranches(IntTreeNode node) {
		
		if(node == null) {
			return 1;
		}else {
			return countEmptyBranches(node.left) + countEmptyBranches(node.right);			
		}
	}
	//--------------------------------------------------------
	
	// pre : max >= 0 (throws IllegalArgumentException if not)
	// post: constructs a sequential tree with given number of
	// nodes
	public IntTree(int max) {
		if (max < 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		overallRoot = buildTree(1, max);
	}

	// post: returns a sequential tree with n as its root unless
	// n is greater than max, in which case it returns an
	// empty tree
	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max),
			buildTree(2 * n + 1, max));
		}
	}

	// post: prints the tree contents using a preorder traversal
	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}

	// post: prints in preorder the tree with given root
	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	// post: prints the tree contents using an inorder traversal
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}

	// post: prints in inorder the tree with given root
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	// post: prints the tree contents using a postorder traversal
	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();
	}

	// post: prints in postorder the tree with given root
	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}

	// post: prints the tree contents, one per line, following an
	// inorder traversal and using indentation to indicate
	// node depth; prints right to left so that it looks
	// correct when the output is rotated.
	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	// post: prints in reversed preorder the tree with given
	// root, indenting each line to the given level
	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print(" ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}
}