package Basic;
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
	
	//왼쪽 노드 먼저 출력
	public void inorder(Node node) {
		
		//마지막 자식 node까지 갈 때까지
		if(node != null) {
			
			//왼쪽 node를 계속 넣어주며 재귀호출
			inorder(node.left);
			
			//왼쪽 끝까지 갔다면 자기 자신 출력
			System.out.println(node.data);
			
			//그리고 오른쪽으로 돌린다
			inorder(node.right);
			
		}
		
	}
	
}


public class BinaryTreeTraversal {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		
		//지금 만들 node
		//		1
		//	 2		3
		//4		5
		
		//마지막 node부터 생성
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);
		
		Node n2 = t.makeNode(n4, 2, n5);
		Node n3 = t.makeNode(null, 3, null);
		Node n1 = t.makeNode(n2, 1, n3);
		
		//이제 1을 루트로 만든다
		t.setRoot(n1);
		
		t.postorder(t.getRoot());

	}

}
