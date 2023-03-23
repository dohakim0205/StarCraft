package StarCraft;

class Tank extends GroundUnit implements Repairable, Damageable {
	public Tank() {
		super(120, "��ũ");
	}
	
	public void damaged(int damage) {
		super.setHp(super.getHp() - damage);
		System.out.printf("%s : ����...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}