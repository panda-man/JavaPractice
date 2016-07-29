package jvm;

public class Account02 {
	public void setBalance(int x){
		int balance;
		if(x<0) throw new IllegalArgumentException();
		balance = 0;
	}
}
