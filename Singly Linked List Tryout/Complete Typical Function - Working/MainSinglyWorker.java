/*
 * Question:
 * Create a generic Singly Linked List that enables the user to
 *  CHECK node count status
 *  INSERT node at the START 
 *  INSERT node at the END
 *  REMOVE node at the START
 *  REMOVE node at the END
 *  DISPLAY all nodes 
 */

//CODE:
//package ADS.Chap3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSinglyWorker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLSInstrument sllObj1 = new SinglyLSInstrument();
		int selectedCase = 0;
		char quitPgm = 'n';
		String inputString;
		
		System.out.println("Input Appropriately");		
		do{
			System.out.println("\n\n1. Check Node Count");
			System.out.println("2. Insert Node at Start");
			System.out.println("3. Insert Node at End");
			System.out.println("4. Remove Node at Start");
			System.out.println("5. Remove Node at End");
			System.out.println("6. Display all Nodes");
			System.out.println("7. or any invalid entries to QUIT");
			System.out.print("Input: ");
			
			try{
				selectedCase = scan.nextInt();	
			}catch(InputMismatchException e){
				System.out.println("Invalid entry...");
				quitPgm = 'y';
			}
			
			
			switch(selectedCase){
			case 1:
				sllObj1.getNodeCount();
				break;
			case 2:
				System.out.print("Input String: ");
				inputString = scan.next();
				sllObj1.addNodeAtStart(inputString);
				break;
			case 3:
				System.out.print("Input String: ");
				inputString = scan.next();
				sllObj1.addNodeAtEnd(inputString);
				break;
			case 4:
				sllObj1.removeNodeAtStart();
				break;
			case 5:
				sllObj1.removeNodeAtEnd();
				break;
			case 6:
				sllObj1.displayAll();
				break;
			default:
				quitPgm = 'y';
				System.out.println("Quitting the pgm...");
			}
		}while(quitPgm != 'y');
		
		scan.close();
	}
}

/*
OUTPUT:
Input Appropriately


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 1
Total Node Count: 0


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 2
Input String: Vivek
"Vivek" is added...
Total Node Count: 1
Node 0: Vivek


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 3
Input String: Iavshali
"Iavshali" is added...
Total Node Count: 2
Node 0: Vivek
Node 1: Iavshali


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 2
Input String: Sharan
"Sharan" is added...
Total Node Count: 3
Node 0: Sharan
Node 1: Vivek
Node 2: Iavshali


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 3
Input String: Shalini
"Shalini" is added...
Total Node Count: 4
Node 0: Sharan
Node 1: Vivek
Node 2: Iavshali
Node 3: Shalini


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 5
"Shalini" is removed...
Total Node Count: 3
Node 0: Sharan
Node 1: Vivek
Node 2: Iavshali


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 4
"Sharan" is removed...
Total Node Count: 2
Node 0: Vivek
Node 1: Iavshali


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 5
"Iavshali" is removed...
Total Node Count: 1
Node 0: Vivek


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 4
"Vivek" is removed...
Total Node Count: 0


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 4
No Nodes available to remove
Total Node Count: 0


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 5
"Vivek" is removed...
Total Node Count: 0


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 2
Input String: Vivek
"Vivek" is added...
Total Node Count: 1
Node 0: Vivek


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 3
Input String: Iavshali
"Iavshali" is added...
Total Node Count: 2
Node 0: Vivek
Node 1: Iavshali


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 3
Input String: Shalini
"Shalini" is added...
Total Node Count: 3
Node 0: Vivek
Node 1: Iavshali
Node 2: Shalini


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 3
Input String: Sharan
"Sharan" is added...
Total Node Count: 4
Node 0: Vivek
Node 1: Iavshali
Node 2: Shalini
Node 3: Sharan


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 6
Total Node Count: 4
Node 0: Vivek
Node 1: Iavshali
Node 2: Shalini
Node 3: Sharan


1. Check Node Count
2. Insert Node at Start
3. Insert Node at End
4. Remove Node at Start
5. Remove Node at End
6. Display all Nodes
7. or any invalid entries to QUIT
Input: 7
Quitting the pgm...
*/
 
