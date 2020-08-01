/**
 * 
 */
package co.akash.nonlineards;

/**
 * @author akash
 *
 */
public class TreeNode {

	private Object data;
	private TreeNode left, right;

	public TreeNode(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
