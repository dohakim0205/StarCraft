package StarCraft;

/*
 * 미션
 * damage() 메소드를 가진
 * interface Damageable을 정의하고
 * 최하위 유닛들 (모든) 에게 Damageable 상속
 * main에서 각각의 유닛들을 손상시킨 후 repair() 돌려보기
 */

public class Main {
	public static void main(String[] args) {
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		Enemy enemy = new Enemy("질럿");
		int damage = enemy.attack();
		tank.damaged(damage);
		scv.repair(tank);
		
		enemy = new Enemy("오버로드");
		damage = enemy.attack();
		marine.damaged(damage);
//		scv.repair(marine);
		
		enemy = new Enemy("뮤탈");
		damage = enemy.attack();
		scv.damaged(damage);
		scv.repair(scv);
		
		enemy = new Enemy("강아지");
		damage = enemy.attack();
		dropship.damaged(damage);
		scv.repair(dropship);
	}
}
