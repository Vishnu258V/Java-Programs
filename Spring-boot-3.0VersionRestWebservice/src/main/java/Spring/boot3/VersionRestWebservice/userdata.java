package Spring.boot3.VersionRestWebservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userdata {

	@Id
	private String username;
	private String email;
	private String password;
	private long phonenumber;
	
	public userdata(String userName, String Email, String Password, long phoneNumber) {
		username = userName;
		email = Email;
		password = Password;
		phonenumber = phoneNumber;
	}

	public userdata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public long getPhoneNumber() {
		return phonenumber;
	}

	public void setUserName(String userName) {
		username = userName;
	}

	public void setEmail(String Email) {
		email = Email;
	}

	public void setPassword(String Password) {
		password = Password;
	}

	public void setPhoneNumber(long phoneNumber) {
		phonenumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "userdetails [UserName=" + username + ", Email=" + email + ", Password=" + password + ", PhoneNumber="
				+ phonenumber + "]";
	}
	
	
}
