package StarCraft;

/*
 * �̼�
 * damage() �޼ҵ带 ����
 * interface Damageable�� �����ϰ�
 * ������ ���ֵ� (���) ���� Damageable ���
 * main���� ������ ���ֵ��� �ջ��Ų �� repair() ��������
 */

public class Main {
	public static void main(String[] args) {

		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		Enemy enemy = new Enemy("����");
		enemy.attack();
		tank.damaged();
		scv.repair(tank);

		enemy = new Enemy("�����ε�");
		enemy.attack();
		marine.damaged();
//		scv.repair(marine);

		enemy = new Enemy("��Ż");
		enemy.attack();
		scv.damaged();
		scv.repair(scv);

		enemy = new Enemy("������");
		enemy.attack();
		dropship.damaged();
		scv.repair(dropship);
	}
}
