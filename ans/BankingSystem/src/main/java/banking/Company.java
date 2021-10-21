package banking;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		// complete the function
		super(Integer.valueOf( taxId + "00000"));
		this.companyName = companyName;
	}

	public String getCompanyName() {
		// complete the function
        return this.companyName;
	}
}
