package StarCraft;

class Tank extends GroundUnit implements Repairable, Damageable {
	public Tank() {
		super(120, "��ũ");
	}
	
	@Override
	public void damaged() {
		super.setHp(super.getHp() - Enemy.getDamage());
		System.out.printf("%s : ����...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}