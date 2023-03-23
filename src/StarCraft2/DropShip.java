package StarCraft2;

class DropShip extends AirUnit implements Repairable, Damageable {
	public DropShip() {
		super(70, "DropShip");
	}
	
	public void damaged(int damage) {
		super.setHp(super.getHp() - damage);
		System.out.printf("%s : À¸¾Ç...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}
