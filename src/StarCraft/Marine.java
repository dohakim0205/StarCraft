package StarCraft;

class Marine extends GroundUnit implements Damageable {
	public Marine() {
		super(100, "¸¶¸°");
	}
	
	@Override
	public void damaged() {
		super.setHp(super.getHp() - Enemy.getDamage());
		System.out.printf("%s : À¸¾Ç...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}
