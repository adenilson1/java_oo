package entities;

public class NaturalPerson extends Person {

	private Double spentOnHealth;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double spentOnHealth) {
		super(name, annualIncome);
		this.spentOnHealth = spentOnHealth;
	}

	public Double getSpentOnHealth() {
		return spentOnHealth;
	}

	public void setSpentOnHealth(Double spentOnHealth) {
		this.spentOnHealth = spentOnHealth;
	}

	@Override
	public Double taxPaid() {
		double taxPaid = (getAnnualIncome() < 20000.00)
				? getAnnualIncome() * 0.15
				: (getAnnualIncome() * 0.25 - spentOnHealth * 0.5);

		return taxPaid;
	}

}
