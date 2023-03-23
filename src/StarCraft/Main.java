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
		enemy.attack();
		tank.damaged();
		scv.repair(tank);

		enemy = new Enemy("오버로드");
		enemy.attack();
		marine.damaged();
//		scv.repair(marine);

		enemy = new Enemy("뮤탈");
		enemy.attack();
		scv.damaged();
		scv.repair(scv);

		enemy = new Enemy("강아지");
		enemy.attack();
		dropship.damaged();
		scv.repair(dropship);
	}
}
