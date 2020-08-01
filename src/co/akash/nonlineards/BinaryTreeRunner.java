/**
 * 
 */
package co.akash.nonlineards;

/**
 * 
 * This is tester class for BinaryTree.
 * 
 * @author akash
 *
 */
public class BinaryTreeRunner {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(4);
		TreeNode third = new TreeNode(7);
		TreeNode fourth = new TreeNode(8);
		TreeNode fifth = new TreeNode(2);

		binaryTree.setRoot(first);
		binaryTree.getRoot().setLeft(second);
		binaryTree.getRoot().setRight(third);

		binaryTree.getRoot().getLeft().setLeft(fourth);
		binaryTree.getRoot().getLeft().setRight(fifth);
		
		System.out.println(binaryTree.getRoot());
	}
	
}
