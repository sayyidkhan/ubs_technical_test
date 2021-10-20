package banking;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		super(Integer.valueOf( idNumber ));
		// complete the function
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// complete the function
        return this.firstName;
	}

	public String getLastName() {
		// complete the function
        return this.lastName;
	}
}
