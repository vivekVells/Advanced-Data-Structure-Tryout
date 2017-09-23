public class SinglyLinkedListFrame {
	private int nodeCounter = 0;
	private NodeMain startNodeRef = null, endNodeRef = null;
	
	public void getNodeAvailability(){
		System.out.println("Total Node Count: " + nodeCounter);
	}
	
	public void firstNodeEntry(String dataArg){
		startNodeRef = endNodeRef = new NodeMain();
		startNodeRef.nodeNext = null;
		startNodeRef.nodeHeart = dataArg;
	}
	
	public void addNodeAtFront(String dataArg){
		nodeCounter++;
		
		if(startNodeRef == null){
			firstNodeEntry(dataArg);
		}else if(endNodeRef.nodeNext != null){
			NodeMain tempNodeRef = startNodeRef;
			startNodeRef = new NodeMain();
			startNodeRef.nodeHeart = dataArg;
			startNodeRef.nodeNext = tempNodeRef;
			endNodeRef = tempNodeRef;
		}else if(endNodeRef.nodeNext == null){
			NodeMain tempNodeRef = startNodeRef;
			startNodeRef = new NodeMain();
			startNodeRef.nodeHeart = dataArg;
			startNodeRef.nodeNext = tempNodeRef;
		}
	}
	
	public void addNodeAtEnd(String dataArg){
		nodeCounter++;
		
		if(startNodeRef == null){
			firstNodeEntry(dataArg);
		}else{
			System.out.println("addNodeAtEnd else executed...");
			System.out.println("endNodeRef: " + endNodeRef);
			System.out.println("endNodeRef.nodeHeart: " + endNodeRef.nodeHeart);
			NodeMain tempNodeRef1 = endNodeRef;
			endNodeRef = new NodeMain();
			endNodeRef.nodeHeart = dataArg;
			endNodeRef.nodeNext = tempNodeRef1;
		}
	}
	public void displayAllNodes(){
		NodeMain currentNodeRef = startNodeRef;
		int nodeIndex = 0;
		System.out.println("Total Node Count: " + nodeCounter);
		while(currentNodeRef != null){
			System.out.println("Node " + nodeIndex + ": " + currentNodeRef.nodeHeart);
			currentNodeRef = currentNodeRef.nodeNext;
			nodeIndex++;
		}
	}
}
