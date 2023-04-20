package StudentDetailsWithoutDataBase;

public class StudentDetails {

	private int studentId;
	private String firstName;
	private String lastName;
	private String collegeName;
	private String location;

	public StudentDetails(int studentId, String firstName, String lastName, String collegeName, String location) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.collegeName = collegeName;
		this.location = location;
	}

	// Getters
	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getLocation() {
		return location;
	}

	// Setters
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student Details : "+
				"\n[studentId   = " + studentId + 
				"\nfirstName    = " + firstName + 
				"\nlastName     = " + lastName+
				"\ncollegeName  = " + collegeName + 
				"\nlocation     = " + location + "]";
	}

}
