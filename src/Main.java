public class Main {
public static void main(String[] args) throws InterruptedException {
	ATM atm=new ATM();
	Account account=new Account("Ali", "2255", 500);
	atm.work(account);
	Thread.sleep(100);
	System.out.print("ATM program closed");
	Thread.sleep(150);
	System.out.print(".");
	Thread.sleep(150);
	System.out.print(".");
	Thread.sleep(150);
	System.out.print(".");
	Thread.sleep(150);
	System.out.print(" !");
	
} 

}
