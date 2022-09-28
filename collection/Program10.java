/*) Suppose that you are given the In-Order traversal of the Binary Search Tree in the 
form of ArrayList or Array. Now your task is that you have create a new ArrayList or 
Array for the In-Order traversal of Binary Search Tree where all duplicates are 
removed.*/
package collection;
class Node
{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}
public class Program10
{
		Node root;
		Program10() 
		{
			root=null;
		}
		void printInorder(Node node)
		{
			if(node==null)
				return;
			printInorder(node.left);
			System.out.print(node.key + " ");

			printInorder(node.right);
		}
		void printInorder() { printInorder(root); }

		public static void main(String[] args)
		{
			Program10 program10 = new Program10();
			program10.root = new Node(1);
			program10.root.left = new Node(2);
			program10.root.right = new Node(3);
			program10.root.left.left = new Node(4);
			program10.root.left.right = new Node(5);

			System.out.println("\nInorder traversal of binary tree is ");
			program10.printInorder();
		}

}