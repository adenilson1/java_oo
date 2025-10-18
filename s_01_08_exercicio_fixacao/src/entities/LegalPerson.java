package entities;

public class LegalPerson extends Person {

	private Integer numberOfEmplyees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmplyees) {
		super(name, annualIncome);
		this.numberOfEmplyees = numberOfEmplyees;
	}

	public Integer getNumberOfEmplyees() {
		return numberOfEmplyees;
	}

	public void setNumberOfEmplyees(Integer numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}

	@Override
	public Double taxPaid() {

		double taxPaid = (numberOfEmplyees > 10) 
						  ? getAnnualIncome() * 0.14 
						  : getAnnualIncome() * 0.16;

		return taxPaid;
	}

}
