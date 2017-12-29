import java.util.Scanner;
public class A10dot7 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		 
		Account[] accounts = new Account[10];
			for(int i = 0; i < accounts.length; i++){
				accounts[i] = new Account(i, 100.00);
			}
		
			int id = 0;
			do {
				System.out.print("Please enter an ID: ");
				id= input.nextInt();
				if(id >= 0 && id < accounts.length){
					drawMenu(accounts[id]);
					
				}else if (id > 0){
				System.out.println("Please enter a valid id");	
				}
			} while (id >= 0);				

	}

	private static void drawMenu(Account account) {
		int choice; 
		do {
			System.out.println("\nMain Menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposite");
			System.out.println("4: exit");
			System.out.print("Enter a choice ");
			choice = input.nextInt();
			switch (choice) {
			case 1: System.out.printf("Your balance is $%.2f%n", account.getBalance());
				break;
			case 2:System.out.println("How much woiuld you like?");
				double amount = input.nextDouble();
				account.withdraw(amount);
			break;
			case 3: System.out.println("How much would you like to deposit?");
				amount = input.nextDouble();
				account.deposite(amount);
			break;
			case 4: System.out.println("Thank you");
			break;
			default: System.out.println("Invalid option");
			
			}
			
		} while (choice != 4);
		
		
	}

}
