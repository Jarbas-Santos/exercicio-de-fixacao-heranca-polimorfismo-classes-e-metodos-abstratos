package entities;

public class Individual extends TaxPayer {

	private Double healthExpenses;
	
	public Individual() {
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {		
		if (super.getAnnualIncome() < 20000.0) {			
			return super.getAnnualIncome() * 0.15 - healthExpenses * 0.5;
		} 
		else {
			return super.getAnnualIncome() * 0.25 - healthExpenses * 0.5;
		}				
	}
}
