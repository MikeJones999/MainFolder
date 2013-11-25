
public class TreeNodeRun
{
	
	public Node root;
	
	
	public static void main (String[] args)
	{
		new TreeNodeRun().start();
		
	}

	
	public void start()
	{
		NodeFetch root = new Node(10);
		 
		
		root.add(12);
		root.add(24);
		root.add(18);
		root.add(11);
		root.add(6);
		root.add(2);
		root.add(36);
		root.add(3);
		root.add(7);
		root.add(8);
		System.out.println("InOrder Traversal");
		
		root.inOrderTraverseTree((Node) root);
		
		System.out.println("PreOrder Traversal");
		root.preOrderTraverseTree((Node) root, "L");
		
		System.out.println("Highest int in tree: " + root.getMax());
		System.out.println("Lowest int in tree: " + root.getMin());
		
				System.out.print("There are " + root.getLevels() + " levels to this tree");
		

	}
	
}
