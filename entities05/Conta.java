package entities05;

public class Conta {
	public int number;
	public String holder;
	public boolean yes_no; 
	public double balance;
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= balance -5;
	}
}

