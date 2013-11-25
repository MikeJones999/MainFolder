

//indiviual nodes
public class IntegerTree implements NodeFetch
{

	private Node root;

	@Override
	public void add(int newNumber) 
	{
		if(root == null)
		{
			root = new Node(newNumber);
			return;
		}
		
		//if we have tree - then use add method of NODE
		root.add(newNumber);
		
	}
	
	@Override
	public boolean contains(int n)
	{
		if (n == root.value) 
		{
			return true;
		} 
		
		return root.contains(n);
		
	}
	
	@Override
	public void inOrderTraverseTree()
	{		
		if(root == null)
		{
			return;
		}
		
		
		 	///Recursively move down left side then right
			inOrderTraverseTree(.left);
			
			System.out.println(focusNode.value);
			
			inOrderTraverseTree(focusNode.right);
	}
	
	@Override
	public void preOrderTraverseTree(Node focusNode, String side)
	{
		if(focusNode == null)
		{
			System.out.println(side + "[]");
		}
		
		if(focusNode != null)
		{
			
			System.out.println(side + " " + focusNode.value);
			
			///Recursively move down left side then right
			preOrderTraverseTree(focusNode.left, "L");			
			
			preOrderTraverseTree(focusNode.right, "R");
						
		}
		
	}
	
	@Override
	public int getLevels()
	{
		int maxCounter = 0;
		Node holder = this;
		Node previous = null;
		while (holder != null)
		{		
			
			previous = holder;
			maxCounter++;
			holder = holder.right;
		
		}	
		
		int minCounter = 0;
		holder = this;
		previous = null;
		while (holder != null)
		{			
			previous = holder;
			minCounter++;
			holder = holder.left;
		}				
		

		int counter = 0;		
		if (minCounter > maxCounter)
		{
			counter = minCounter;
		} else if (minCounter < maxCounter)
					{
						counter = maxCounter;
					} else if (minCounter == maxCounter)
								{
									counter = maxCounter;						
								}		
		return counter;		
	}
	
	


	@Override
	public int getMax() 
	{
		int maxCounter = 0;
		System.out.println("Get Maximum int");
		Node holder = this;
		Node previous = null;
		while (holder != null)
		{		
			
			previous = holder;
			maxCounter++;
			holder = holder.right;
			System.out.println(previous.value);
		}	
		
		System.out.println("there are " + maxCounter + " levels to this tree");
		return previous.value;
	}


	@Override
	public int getMin() 
	{
		int minCounter =0;
		System.out.println("Get Minimum int");
		Node holder = this;
		Node previous = null;
		while (holder != null)
		{			
			previous = holder;
			minCounter++;
			holder = holder.left;
			System.out.println(previous.value);
		}				
		
		System.out.println("there are " + minCounter + " levels to this tree");
		return previous.value;
	}

	
	
};

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

