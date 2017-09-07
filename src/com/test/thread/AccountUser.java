package com.test.thread;

public class AccountUser implements Runnable{
	Account a;
	AccountUser(Account a,double x){
		this.a = a;
		a.setNumber(x);
	}
	public void run(){
		
		a.op();
		
	}
	public static void main(String[] args){
		Account a =  new Account("Äã",3000);
		a.setOp(Account.sub);
		AccountUser au = new AccountUser(a,2000);
		Thread t1 = new Thread(au,"Äã");
		Thread t2 = new Thread(au,"ÄãÀÏÆÅ");
		t1.start();
		t2.start();
		
	}

}
