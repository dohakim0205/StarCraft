package StarCraft;

import java.util.Random;

class Enemy {
	private static Random random;
	String name;
	
	public Enemy(String name) {
		random = new Random();
		this.name = name;
	}
	
	public static int getDamage() {
		return random.nextInt(10)+1;
	}

	public int attack() {
		try {
			Thread.sleep(1000);
			System.out.printf("�� �߰�! [%s] ����\n", this.name);
			Thread.sleep(1000);
			System.out.println(this.name + "��(��) �����ߴ�!");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return random.nextInt(10) + 1;
	}
	
	
}
