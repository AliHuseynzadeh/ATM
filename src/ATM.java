import java.util.Scanner;

public class ATM {
	public void work(Account account) throws InterruptedException {
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome my ATM program\n"
				+ "**************************************************************************************************\n"
				+ "User Interface in console \n"
				+ "**************************************************************************************************"
				+ "");
		int entrance_limit = 3;
		while (true) {
			if (login.login(account) == true) {
				System.out.println("Login succesfull ;) ");
				break;
			} else {
				System.out.println("Login  failed");
				entrance_limit -= 1;
				System.out.println("Remaining entries: " + entrance_limit);
			}
			if (entrance_limit == 0) {
				System.out.println("Entrance limit is over...!");
				return;
			}

		}
		System.out.println("Operations is loading...");
		char[] hascode = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',
				'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'
				,'#','#','#','#','#','#','#','#','#'};
		for (int i = 0; i < hascode.length; i++) {
			Thread.sleep(100);
			  System.out.print(hascode[i]);
			}
		System.out.println("\n" + "Operations\n"
				+ "1]---> Show Balance\n" + "2]---> Deposit\n" + "3]---> Wtihdraw\n" + "q]---> Exit\n"
				+ "##########################################################");
		while (true) {
			System.out.print("Choosing operation: ");
			String operation;
			operation = scanner.nextLine();
			if (operation.equals("q")) {
				break;
			} else if (operation.equals("1")) {
				System.out.println("Your balance is: " + account.getAmount()+" azn");
			} else if (operation.equals("2")) {
				System.out.print("Please include deposit amount:");
				int sum = scanner.nextInt();
				scanner.nextLine();
				account.depositMoney(sum);
			}
			else if (operation.equals("3")) {

				System.out.print("Please include withdraw amount:");
				int sum=scanner.nextInt();
				scanner.nextLine();
				account.withdrawMoney(sum);
				
			}
			else {
				System.out.println("Invalid operation!!!");
			}
		}
	}

}
