package ATM_Application;


public class AtmApplication {

	public static void main(String[] args) throws Exception {

		OptionsMenu op = new OptionsMenu();

		try {
			op.getLogin();
		} catch (WrongPassword e) {
			System.out.println(e.getMessage());
		}
	}

}