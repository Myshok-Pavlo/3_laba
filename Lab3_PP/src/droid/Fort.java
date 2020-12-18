package droid;

public class Fort extends Droid  {
	public Fort() {
		health = 300;
		damage = 0;
		armor = 10;
		regeneration = 3;
	}

	// get the hit
	public void strike(Droid Enemy) {
		return;
	}

	public void takeHit(double levelHit) {
		health = health - levelHit;		
		String healthFormatted = String.format("%.2f", health);
		System.out.println("Current level of health of "+this.name + "\tis\t" +healthFormatted);
	}
	
}
