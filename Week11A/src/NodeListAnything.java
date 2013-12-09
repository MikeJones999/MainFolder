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
		
		Node<String> newNode = new Node<String>();
		
		newNode.setName("Employee1");
		
		newNodeList.addNode(newNode);
		
		newNodeList.printList();
	
	}


}