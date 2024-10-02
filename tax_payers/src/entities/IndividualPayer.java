package entities;

public class IndividualPayer extends Payer {
	
	private Double healthExpenditures;
	
	public IndividualPayer() {
		super();
	}

	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double subTotal() {
		if (super.getAnualIncome() < 20000) {
			return (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		} else {
			return (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
	}
}
