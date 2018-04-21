package abstract_classes.cities;

public class Boston extends City{
	public Boston(int population, double growthRate) {
		super(population,growthRate);
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (getPopulation()*getGrowthRate() + (0.5*getPopulation()));
	}
}
