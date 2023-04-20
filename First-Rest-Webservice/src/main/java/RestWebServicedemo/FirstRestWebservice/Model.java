package RestWebServicedemo.FirstRestWebservice;

public class Model {

	private String userName;
	private String email;
	private long phoneNumber;
	private String password;
	
	public Model(String userName, String email, long phoneNumber, String password) {
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	// Getters
	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	// Setters
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Model [userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}
	
	
	
	

	
	
	
	
	
}
