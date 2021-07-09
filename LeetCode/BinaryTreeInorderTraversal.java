/*

 94. Binary Tree Inorder Traversal (이진트리 중위순회)
 https://leetcode.com/problems/binary-tree-inorder-traversal/
 
 Given the root of a binary tree, return the inorder traversal of its nodes' values.
 
*/

//node 먼저 정의
class Node{
	int data;
	Node left;
	Node right;
}
	
class Tree{
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node node) {
		this.root = node;
	}
	
	//node를 만들어서 data와 left, right를 할당
	public Node makeNode(Node left, int data, Node right) {
		
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		
		return node;
	}
}


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		
		//지금 만들 node
		//		1
		//	 2		3
		//4		5
		
		//마지막 node부터 생성
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);

	}

}
