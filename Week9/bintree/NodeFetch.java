
public interface NodeFetch 
{

	/**
	 * get maximum value in tree
	 * 
	 */
	int getMax();
	
	/**
	 * 
	 * get minimum value in tree
	 */
	int getMin();
	
	/**
	 * add a number to the tree
	*/	
	void add(int newNumber);
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	 boolean contains(int n);
	 
	 
	 /**
	  * 
	  * @param focusNode
	  */
	 void inOrderTraverseTree(Node focusNode);
	 
	 
	 /**
	  * 
	  * @param focusNode
	  */
	 void preOrderTraverseTree(Node focusNode,  String side);
	 


	 int getLevels();
	
}
