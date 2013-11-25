

//indiviual nodes
public class IntegerTree implements NodeFetch
{
	Node root;	
	

		public void add(int newNumber) 
		{
			
			if (root == null)
			{
				root.value = newNumber;				
			}
			
			
			if (newNumber > this.value) 
			{
				if (right == null)
				{
					right = new Node(newNumber);			
				} 
				else 
					{
						right.add(newNumber);
					}			
			} else {
						if (left == null) 
						{
							left = new Node(newNumber);
						}
							else 
								{
								  left.add(newNumber);
								}
				   }
		}


			public boolean contains(int n)
			{
				if (n == this.value) 
				{
					return true;
				} else if (n > this.value)
						{
							if (right == null) 
								{
								  return false;
								}
									else 
								{
									return right.contains(n);
								}
						} 
							else
							{
								if (left == null) 
								{
									return false;
								} else
										{
											return left.contains(n);
										}
							}
			}


					public void inOrderTraverseTree(Node focusNode)
					{
						if(focusNode != null)
						{
							
							///recusively move down left side then right
							inOrderTraverseTree(focusNode.left);
							
							System.out.println(focusNode.value);
							
							inOrderTraverseTree(focusNode.right);
										
						}
						
					}
					
					public void preOrderTraverseTree(Node focusNode)
					{
						if(focusNode != null)
						{
							
							System.out.println(focusNode.value);
							
							///recusively move down left side then right
							preOrderTraverseTree(focusNode.left);			
							
							
							preOrderTraverseTree(focusNode.right);
										
						}
						
					}


					
					@Override
					public int getMax() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					
					@Override
					public int getMin() {
						// TODO Auto-generated method stub
						return 0;
					}
	
	
	
	
};

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

