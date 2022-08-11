package miniproject;
import java.lang.Math;
import java.util.Scanner;
class BankAccount{
	int balance;
	int previousTransaction;
	String customername;
	String customerID;
	BankAccount(String name,String cid){
		customername=name;
		customerID=cid;
	}
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			previousTransaction=-amount;
		}
	}
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("deposit:"+previousTransaction);
		}
			else if(previousTransaction<0) {
				System.out.println("withdraw:"+Math.abs(previousTransaction));

			}
			else {
				System.out.println("no transaction");

		}
			
		}
	void show() {
char option='\0';
Scanner s=new Scanner(System.in);
System.out.println("wel come---->" +customername);
System.out.println("your id--->"+customerID);

System.out.println(" ");
System.out.println("A: check your balance");
System.out.println("B: deposit");
System.out.println("C: withdraw");
System.out.println("D: previousTransaction");
System.out.println("exit");
do {
	System.out.println("---------------------------------");
	System.out.println("enter your option:");
	System.out.println("***********************************");
	option=s.next().charAt(0);
	System.out.println(" ");
	switch(option) {
	case 'A':
		System.out.println("---------------------------------");

		System.out.println("balance="+balance);
		System.out.println("---------------------------------");

	          break;
	case 'B':
	         System.out.println("deposit AMOUNT=");
	         int amount=s.nextInt();
	         deposit(amount);
              break;
	case 'C':
		System.out.println("withdraw AMOUNT=");
        int amount1=s.nextInt();
        withdraw(amount1);
         break;
         
	case'D':
		System.out.println("***********************************");

		getpreviousTransaction();
		System.out.println("---------------------------------");

         break;
         default:
        	 System.out.println("exit");
        	 break;
	}


}
while(option!='E');
System.out.println("THANKS FOR USING OUR SERVICE");

   }
}
public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount b=new BankAccount("DEEKSHA","07008725000UB");
b.show();  
	}

}
