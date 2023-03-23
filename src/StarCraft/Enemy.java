package StarCraft;

import java.util.Random;

class Enemy {
	Random random;
	String name;

	public Enemy(String name) {
		this.random = new Random();
		this.name = name;
	}

	public int attack() {
		try {
			Thread.sleep(1000);
			System.out.printf("적 발견! [%s] 등장\n", this.name);
			Thread.sleep(1000);
			System.out.println(this.name + "이(가) 공격했다!");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return random.nextInt(10) + 1;
	}
}
