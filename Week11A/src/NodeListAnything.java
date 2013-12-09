public class NodeListAnything
{

	public static void main (String[] args)
	{
		new NodeListAnything().start();
	
	}

	public void start()
	{
		
		//create a node list first
		NodeList newNodeList = new NodeList();
		
		Node<String> newNode1 = new Node<String>();		
		newNode1.setName("Employee1");		
		newNodeList.addNode(newNode1);

		Node<String> newNode2 = new Node<String>();		
		newNode2.setName("Employee2");		
		newNodeList.addNode(newNode2);
		
		newNodeList.printList();
		
		
	
	}


}