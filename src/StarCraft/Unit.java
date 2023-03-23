package StarCraft;

class Unit {
	public final int MAX_HP;
	private int hp;
	private String name;

	public Unit(int hp, String name) {
		this.MAX_HP = hp;
		this.hp = this.MAX_HP;
		this.name = name;
		System.out.printf("%sÀÇ Åº»ý! [hp:%d/%d]\n", this.name, this.hp, this.MAX_HP);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
}
