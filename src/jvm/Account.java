package jvm;

public class Account {
	String owner;
	int balance;
	public Account(String owner, int balance){
		this.owner = owner;
		this.balance = balance;
	}
	public void trasfer(Account dest, int amount){
		dest.balance += amount;
		this.balance -= amount;
	}
}
