public class Account {
	
	public static int numAccounts = 0;
	
	Account() {
		Account.numAccounts = 1;
	}
	
	public static int getNumAccounts(int x) {
		x = numAccounts++;
		return numAccounts;
	}
	
	public static void main(String[] args) {
		Account AccObj = new Account();
		System.out.println(Account.numAccounts);
	}
}