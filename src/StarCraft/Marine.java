package StarCraft;

class Marine extends GroundUnit implements Damageable {
	public Marine() {
		super(100, "¸¶¸°");
	}
	
	public void damaged(int damage) {
		super.setHp(super.getHp() - damage);
		System.out.printf("%s : À¸¾Ç...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}
