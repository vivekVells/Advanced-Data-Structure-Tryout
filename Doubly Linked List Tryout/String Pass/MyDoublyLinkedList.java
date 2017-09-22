public class MyDoublyLinkedList {
	private int nodeCounter = 0;
	private NodeMain startNodeRef = null, endNodeRef = null, tempNodeRef = null;
	
	public void addNodeAtBack(String dataArg){	
		nodeCounter++;
		if(startNodeRef == null){
			startNodeRef = endNodeRef = new NodeMain();
			startNodeRef.frontNode = startNodeRef.backNode = null;
			startNodeRef.nodeHeart = dataArg;
			System.out.println("startNodeRef.backNode Node " + nodeCounter + ": " + startNodeRef.backNode);
			System.out.println("startNodeRef.nodeHeart Node " + nodeCounter + ": " + startNodeRef.nodeHeart + "#\n");				
		//} else if(startNodeRef.frontNode == null && startNodeRef.backNode == null){
		} else{
			if(startNodeRef.backNode == null){
				startNodeRef.backNode = new NodeMain();
				endNodeRef = startNodeRef.backNode;
				//endNodeRef = new NodeMain();
				endNodeRef.frontNode = startNodeRef.backNode;
				startNodeRef.backNode = endNodeRef.frontNode;
				endNodeRef.backNode = null;
				endNodeRef.nodeHeart = dataArg;
				System.out.println("endNodeRef Node " + nodeCounter + ": " + endNodeRef);
				//System.out.println("endNodeRef.backNode Node " + nodeCounter + ": " + endNodeRef.backNode);
				//System.out.println("endNodeRef.nodeHeart Node " + nodeCounter + ": " + endNodeRef.nodeHeart);				
				//System.out.println("tempNodeRef Node " + nodeCounter + ": " + tempNodeRef);
				//System.out.println("tempNodeRef.backNode Node " + nodeCounter + ": " + tempNodeRef.backNode);
				//System.out.println("tempNodeRef.nodeHeart Node " + nodeCounter + ": " + tempNodeRef.nodeHeart + "###\n");				
			} else {
				tempNodeRef = endNodeRef;
				tempNodeRef.backNode = new NodeMain();
				endNodeRef = tempNodeRef.backNode;
				//endNodeRef.nodeHeart = dataArg;
				tempNodeRef.frontNode = startNodeRef.backNode;
				tempNodeRef.backNode = endNodeRef.frontNode;
				tempNodeRef.nodeHeart = dataArg;
				//endNodeRef.backNode = null;
				tempNodeRef = endNodeRef;
				endNodeRef.backNode = null;
				/*endNodeRef.backNode = new NodeMain();
				endNodeRef = endNodeRef.backNode;
				tempNodeRef.backNode = endNodeRef.frontNode;
				tempNodeRef.frontNode = startNodeRef.backNode;
				endNodeRef.backNode = null;
				endNodeRef.nodeHeart = dataArg;
				*/
				System.out.println("endNodeRef Node " + nodeCounter + ": " + endNodeRef);
				//System.out.println("endNodeRef.backNode Node " + nodeCounter + ": " + endNodeRef.backNode);
				//System.out.println("endNodeRef.nodeHeart Node " + nodeCounter + ": " + endNodeRef.nodeHeart);				
				System.out.println("tempNodeRef Node " + nodeCounter + ": " + tempNodeRef);
				//System.out.println("tempNodeRef.backNode Node " + nodeCounter + ": " + tempNodeRef.backNode);
				//System.out.println("tempNodeRef.nodeHeart Node " + nodeCounter + ": " + tempNodeRef.nodeHeart + "###\n");
			}
		}
	}
	
	public void displayAll(){
		System.out.println("**************************************************");
		NodeMain currentNodeRef;
		if(nodeCounter > 0){
			System.out.println("Total Nodes Available: " + nodeCounter);
			currentNodeRef = startNodeRef;
			int i=0;
			while(currentNodeRef != null){
				System.out.println("Nodes available is: " + currentNodeRef.nodeHeart);
				System.out.println("currentNodeRef Node " + i + ": " + currentNodeRef);
				//System.out.println("currentNodeRef.backNode: " + currentNodeRef.backNode);
				currentNodeRef = currentNodeRef.backNode;
				//System.out.println("$$$ currentNodeRef.backNode: " + currentNodeRef.backNode);
				i++;
			}
		}else{
			System.out.println("Total Nodes Available: " + nodeCounter);
			System.out.println("No Nodes Available...\n\n");
		}
		System.out.println("**************************************************");
	}
}
