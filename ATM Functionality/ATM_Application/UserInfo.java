package ATM_Application;

public class UserInfo {

	private int accountNumber;
	private int pinNumber;
	private double savingAccBalance;
	private double currentAccBalance;

	// Getters
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getSavingAccBalance() {
		return savingAccBalance;
	}

	public double getCurrentAccBalance() {
		return currentAccBalance;
	}

//Setters
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public void setSavingAccBalance(double savingAccBalance) {
		this.savingAccBalance = savingAccBalance;
	}

	public void setCurrentAccBalance(double currentAccBalance) {
		this.currentAccBalance = currentAccBalance;
	}

}