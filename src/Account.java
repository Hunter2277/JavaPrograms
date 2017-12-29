import java.util.Date;
public class Account {
	
		private int id = 0;
		private double balance = 0.0;
		private double annualInterestRate = 0.0;
		private Date dateCreated;
		
		Account(){
			dateCreated = new Date();
		}
		
		Account(int id, double balance){
			this.id = id;
			this.balance = balance; 
			dateCreated = new Date();
		}

		public int getI() {
			return id;
		}

		public void setI(int i) {
			this.id = i;
		}

		public Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12.0;
		}
		
		public double getMonthlyInterest() {
			return getMonthlyInterestRate() * balance;
		}
		
		public void withdraw(double amount){
			if(balance >= amount){
				balance-=amount;
			}else{
			System.out.println("Insufficient Funds");
			}
		}
		public void deposite(double amount){
			balance =+ amount;
		}
}
