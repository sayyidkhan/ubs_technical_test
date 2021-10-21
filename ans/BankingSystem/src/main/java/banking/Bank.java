package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private static Long accNumGenerator = new Long(0);

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		accNumGenerator += 1;
		Account a = new CommercialAccount(company, accNumGenerator,pin,startingDeposit);
		accounts.put(a.getAccountNumber(),a);
		return a.getAccountNumber();
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		accNumGenerator += 1;
		Account a = new ConsumerAccount(person, accNumGenerator,pin,startingDeposit);
		accounts.put(a.getAccountNumber(),a);
        return a.getAccountNumber();
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account account = this.getAccount(accountNumber);
		if (account != null) {
			return account.validatePin(pin);
		}
		return false;
	}


	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = this.getAccount(accountNumber);
		if(account != null) {
			return account.getBalance();
		}
		return 0;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account account = this.getAccount(accountNumber);
		if(account != null) {
			account.creditAccount(amount);
		}
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = this.getAccount(accountNumber);
		if(account != null) {
			double new_balance = account.getBalance() - amount;
			if(new_balance >= 0) {
				account.debitAccount(amount);
				return true;
			}
		}
		return false;

	}
}
