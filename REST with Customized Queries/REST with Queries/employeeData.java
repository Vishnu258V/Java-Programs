package lastRest.APIwithSQL.Querys;

public class employeeData {

	private int e_empId;
	private String e_name;
	private int e_age;
	private String e_department;
	private long e_salary;
	private String e_address;
	
	
	public employeeData(int e_empId, String e_name, int e_age, String e_department, long e_salary,
			String e_address) {
		super();
		this.e_empId = e_empId;
		this.e_name = e_name;
		this.e_age = e_age;
		this.e_department = e_department;
		this.e_salary = e_salary;
		this.e_address = e_address;
	}


	public employeeData() {

	}


	public int getE_empId() {
		return e_empId;
	}


	public String getE_name() {
		return e_name;
	}


	public int getE_age() {
		return e_age;
	}


	public String getE_department() {
		return e_department;
	}


	public long getE_salary() {
		return e_salary;
	}


	public String getE_address() {
		return e_address;
	}


	public void setE_empId(int e_empId) {
		this.e_empId = e_empId;
	}


	public void setE_name(String e_name) {
		this.e_name = e_name;
	}


	public void setE_age(int e_age) {
		this.e_age = e_age;
	}


	public void setE_department(String e_department) {
		this.e_department = e_department;
	}


	public void setE_salary(long e_salary) {
		this.e_salary = e_salary;
	}


	public void setE_address(String e_address) {
		this.e_address = e_address;
	}


	@Override
	public String toString() {
		return "employeeData [e_empId=" + e_empId + ", e_name=" + e_name + ", e_age=" + e_age + ", e_department="
				+ e_department + ", e_salary=" + e_salary + ", e_address=" + e_address + "]";
	}
	
	
}
