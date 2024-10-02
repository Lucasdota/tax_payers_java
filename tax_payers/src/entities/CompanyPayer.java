package entities;

public class CompanyPayer extends Payer {
	
	private Integer numEmployees;
	
	public CompanyPayer() {
		super();
	}

	public CompanyPayer(String name, Double anualIncome, Integer numEmployees) {
		super(name, anualIncome);
		this.numEmployees = numEmployees;
	}

	@Override
	public double subTotal() {
		if (numEmployees > 10) {
			return super.getAnualIncome() * 0.14;
		} else {
			return super.getAnualIncome() * 0.16;
		}
	}

}
