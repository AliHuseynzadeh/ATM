import java.util.Scanner;

public class Login {
	public boolean login(Account account) {
		Scanner scanner = new Scanner(System.in);
		String user_name;
		String parol;
		System.out.print("Please, include username: ");
		user_name = scanner.nextLine();
		System.out.print("Include password: ");
		parol = scanner.nextLine();
		if (account.getName().equals(user_name) && account.getPassword().equals(parol)) {
			return true;
		}

		else {
			return false;
		}

	}
}
