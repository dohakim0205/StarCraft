package StarCraft;

class DropShip extends AirUnit implements Repairable, Damageable {
	public DropShip() {
		super(70, "DropShip");
	}
	
	@Override
	public void damaged() {
		super.setHp(super.getHp() - Enemy.getDamage());
		System.out.printf("%s : À¸¾Ç...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}
