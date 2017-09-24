/*
 * Question:
 * Create a generic Singly Linked List that enables the user to
 *  CHECK node count status
 *  INSERT node at the START 
 *  INSERT node at the END
 *  REMOVE node at the START
 *  REMOVE node at the END
 *  DISPLAY all nodes
 *  
 *  Refer "MainSinglyWorker.java" file for output
 */

//CODE:
package ADS.Chap3;

public class SinglyLSInstrument {
	protected NodeParts startNodeRef = null, endNodeRef = null;
	protected int nodeCounter = 0;
	
	public void getNodeCount(){
		System.out.println("Total Node Count: " + nodeCounter);
	}
	
	public void initializeNode(String dataArg){
		startNodeRef = endNodeRef = new NodeParts();
		startNodeRef.nodeHeart = dataArg;
		startNodeRef.nodeNext = null;
		System.out.println("\"" + startNodeRef.nodeHeart + "\" is added...");		
	}
	
	public void initializeNodeCountTo0(){
		nodeCounter = 0;
	}
	
	public void addNodeAtStart(String dataArg){
		++nodeCounter;
		
		if(startNodeRef == null && endNodeRef == null){
			initializeNode(dataArg);
		} else {
			NodeParts tempStartNodeRef = startNodeRef;
			startNodeRef = new NodeParts();
			startNodeRef.nodeHeart = dataArg;
			startNodeRef.nodeNext = tempStartNodeRef;
			System.out.println("\"" + startNodeRef.nodeHeart + "\" is added...");
		}
		
		displayAll();
	}
	
	public void addNodeAtEnd(String dataArg){
		++nodeCounter;
		
		if(startNodeRef == null && endNodeRef == null){
			initializeNode(dataArg);	
		} else {
			NodeParts tempEndNodeRef = endNodeRef;
			endNodeRef = new NodeParts();
			endNodeRef.nodeHeart = dataArg;
			endNodeRef.nodeNext = null;
			tempEndNodeRef.nodeNext = endNodeRef;	
			System.out.println("\"" + endNodeRef.nodeHeart + "\" is added...");
		}
		
		displayAll();
	}
	
	public void removeNodeAtStart(){
		if(startNodeRef == null){
			System.out.println("No Nodes available to remove");
		}else{
			System.out.println("\"" + startNodeRef.nodeHeart + "\" is removed...");
			NodeParts tempStartNodeRef = startNodeRef.nodeNext;
			startNodeRef = tempStartNodeRef;
			--nodeCounter;
		}
		
		displayAll();
		
		if(nodeCounter < 0){
			initializeNodeCountTo0();
		}
	}
	
	public void removeNodeAtEnd(){
		if(endNodeRef == null){
			System.out.println("No Nodes available to remove");
		}else{
			int nodeIndex = 1;
			if(nodeCounter > 1) {
				NodeParts tempNodeRefIndexRetrieve = startNodeRef;

				while(nodeIndex < (nodeCounter - 1)){
					tempNodeRefIndexRetrieve = tempNodeRefIndexRetrieve.nodeNext;
					nodeIndex++;
				}
				
				System.out.println("\"" + endNodeRef.nodeHeart + "\" is removed...");

				endNodeRef = tempNodeRefIndexRetrieve;
				endNodeRef.nodeNext = null;	
				--nodeCounter;
			}else{
				System.out.println("\"" + endNodeRef.nodeHeart + "\" is removed...");
				startNodeRef = endNodeRef = null;
				initializeNodeCountTo0();
			}			
		}
		
		displayAll();
		
		if(nodeCounter < 0){ 
			initializeNodeCountTo0();
		}
	}
	
	public void displayAll(){
		NodeParts currentNodeRef = startNodeRef;
		getNodeCount();
		int nodeIndex = 0;
		while(currentNodeRef != null){
			System.out.println("Node " + nodeIndex + ": " + currentNodeRef.nodeHeart);
			currentNodeRef = currentNodeRef.nodeNext;
			nodeIndex++;
		}
	}
}
