package abstract_classes.cities;

public class Atlanta extends City{
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		}
	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (getPopulation()*getGrowthRate()*2);
	}
}
