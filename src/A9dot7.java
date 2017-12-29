
public class A9dot7 {

	public static void main(String[] args) {
		Account ac1 = new Account(1122,20000.00);
		ac1.setAnnualInterestRate(4.5);
		ac1.withdraw(2500.00);
		ac1.deposite(3000.00);
		System.out.printf("Balance = $%.2f%n" , ac1.getBalance());
		System.out.printf("Interest = $%.2f%n" , ac1.getMonthlyInterest());
		System.out.println("Created = " + ac1.getDateCreated());
		
		Account ac2 = new Account(1122,20000.00);
		ac2.setAnnualInterestRate(4.5);
		ac2.withdraw(2500.00);
		ac2.deposite(3000.00);
		System.out.printf("Balance = $%.2f%n" , ac2.getBalance());
		System.out.printf("Inter = $%.2f%n" , ac2.getMonthlyInterest());
		System.out.println("Created = " + ac2.getDateCreated());
		
	}

}
