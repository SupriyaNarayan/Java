
public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	public TreeNode(){
		data = 0;
		left = null;
		right = null;
	}
	
	public TreeNode(int root){
		data=root;
		left=null;
		right=null;
	}
	
	public TreeNode(int root, TreeNode left, TreeNode right){
		data = root;
		this.left = left;
		this.right = right;
	}
	
	public int getItem(){
		return data;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setItem(int elem){
		data = elem;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
}
