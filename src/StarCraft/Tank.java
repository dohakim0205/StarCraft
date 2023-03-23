package StarCraft;

class Tank extends GroundUnit implements Repairable, Damageable {
	public Tank() {
		super(120, "≈ ≈©");
	}
	
	public void damaged(int damage) {
		super.setHp(super.getHp() - damage);
		System.out.printf("%s : ¿∏æ«...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}