
public class TreeNodeRun
{
	
	//public Node root;
	
	
	public static void main (String[] args)
	{
		new TreeNodeRun().start();
		
	}

	
	public void start()
	{
		NodeFetch tree = new IntegerTree();
	
		//NodeFetch root = new Node(10);
		 
		
		tree.add(12);
		tree.add(24);
		tree.add(18);
		tree.add(11);
		tree.add(6);
		tree.add(2);
		tree.add(36);
		tree.add(3);
		tree.add(7);
		tree.add(8);
		System.out.println("InOrder Traversal");
		
		tree.inOrderTraverseTree((Node) tree);
		
		System.out.println("PreOrder Traversal");
		tree.preOrderTraverseTree((Node) tree, "L");
		
		System.out.println("Highest int in tree: " + tree.getMax());
		System.out.println("Lowest int in tree: " + tree.getMin());
		
				System.out.print("There are " + tree.getLevels() + " levels to this tree");

	}
	
}
