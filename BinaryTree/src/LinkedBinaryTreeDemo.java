

public class LinkedBinaryTreeDemo
{
	public static <E> void printPreorder(AbstractTree<E> T)
	{
	    for (Position<E> p : T.preorder())
	      System.out.println(p.getElement());
  	}

		
	public static void main(String[] args)
	{
		//O(log n)
		LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

		tree.addRoot("root");

		tree.addLeft(tree.root(),"left");

		tree.addRight(tree.root(),"right");

		Position<String> p = tree.left(tree.root());

		tree.addLeft(p,"deep-left");

		tree.addRight(p,"deep-right");

		Position<String> q = tree.right(tree.root());

		tree.addRight(q,"right-right");

		printPreorder(tree);
		
		//Runtime = 4.79 ms
		Position<String> preNext = tree.preorderNext(p);
		System.out.println("preorder Next: " + preNext.getElement());
		
		
		//Runtime = 0.36 ms
		Position<String> inNext = tree.inorderNext(p);
		System.out.println("inorder Next: " + inNext.getElement());
		
		
		//Runtime = 0.11 ms
		Position<String> postNext = tree.postorderNext(p);
		System.out.println("postorder Next: " + postNext.getElement());
		
		
	}
}