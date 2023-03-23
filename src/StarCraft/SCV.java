package StarCraft;

class SCV extends GroundUnit implements Repairable, Damageable {
	public SCV() {
		super(110, "SCV");
	}

	public void repair(Repairable patient) {
		if (patient instanceof Unit) {
			Unit target = (Unit) patient;
			while (target.getHp() != target.MAX_HP) {
				target.setHp(target.getHp() + 1);
				System.out.printf("치료중 ... [hp:%d/%d]\n", target.getHp(), target.MAX_HP);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("치료 완료");
		}
	}

	public void damaged(int damage) {
		super.setHp(super.getHp() - damage);
		System.out.printf("%s : 으악...! [hp:%d/%d]\n", super.getName(), super.getHp(), super.MAX_HP);
	}
}