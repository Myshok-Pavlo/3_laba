package droid;


public class Tank extends Droid {

	public Tank() {
		health = 200;
		damage = 20;
		armor = 7;
		regeneration = 0;
	}

	// get the hit
	public void strike(Droid Enemy) {
		Enemy.takeHit(damage);
	}

	public void takeHit(double levelHit) {
		if (armor > 1) {
			health = health - levelHit / armor;
		} else {
			health = health - levelHit;
		}
		String healthFormatted = String.format("%.2f", health);
		System.out.println("Current level of health of " + this.name + "\tis\t" + healthFormatted);
	}
}
