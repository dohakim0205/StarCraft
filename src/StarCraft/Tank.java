package StarCraft;

class Tank extends GroundUnit implements Repairable, Damageable {
	public Tank() {
		super(120, "≈ ≈©");
	}
	
	@Override
	public void damaged() {
		super.setHp(super.getHp() - Enemy.getDamage());
		System.out.printf("%s : ¿∏æ«...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}