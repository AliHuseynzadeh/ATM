public class Account {
	private String name;
	private String password;
	private double amount ;

	public Account(String name, String password, double amount) {
		this.name = name;
		this.password = password;
		
			this.amount = amount;
		

	}

	public void depositMoney(int sum) {
		amount += sum;
		System.out.println("Your new balance is " + amount +" azn.");
	}

	public void withdrawMoney(int sum) {
		if (amount - sum < 0) {
			System.out.println("you don't have enough balance ");
		} else {
			amount -= sum;
			System.out.println("Your new balance is " + amount+" azn.");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return  amount;
	}

	public void setAmount(double  amount) {
		this.amount = amount;
	}

}
