package StudentDetailsWithoutDataBase;

@SuppressWarnings("serial")
public class CustomExceptions extends Exception {

	public CustomExceptions(String message) {
		super(message);
		
	}

	
}

@SuppressWarnings("serial")
class InputMisType extends Exception {

	public InputMisType(String message) {
		super(message);
		
	}

}