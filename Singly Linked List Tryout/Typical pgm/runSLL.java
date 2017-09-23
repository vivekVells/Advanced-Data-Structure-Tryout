import java.util.Scanner;

public class runSLL {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selectOption = 0;
		char reRunSelection = 'y';
		SinglyLinkedListFrame sllObj1 = new SinglyLinkedListFrame();
		
		do{
			System.out.println("\n\n***************************");
			System.out.println("1. Check Node Availability");
			System.out.println("2. Add Node at the start of the series");
			System.out.println("3. Add Node at the end of the series");
			System.out.println("4. Remove Node at the start of the series");
			System.out.println("5. Remove Node at the end of the series");
			System.out.println("6. Display All Node");
			System.out.println("7. To exit");
			System.out.println("Your selection: " );
			selectOption = scan.nextInt();
			
			switch(selectOption){
			case 1:
				sllObj1.getNodeAvailability();
				break;
			case 2:
				String inputString;
				System.out.println("Input String Value: ");
				inputString = scan.next();
				sllObj1.addNodeAtFront(inputString);
				break;
			case 3:
				String inputString1;
				System.out.println("Input String Value: ");
				inputString1 = scan.next();
				sllObj1.addNodeAtEnd(inputString1);
				break;
			case 6:
				sllObj1.displayAllNodes();
				break;
			default:
				reRunSelection = 'n';
			}
						
		}while(reRunSelection != 'n');	
		System.out.println("***************************");
		scan.close();
	}

}
