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
		int damage = enemy.attack();
		tank.damaged(damage);
		scv.repair(tank);
		
		enemy = new Enemy("�����ε�");
		damage = enemy.attack();
		marine.damaged(damage);
//		scv.repair(marine);
		
		enemy = new Enemy("��Ż");
		damage = enemy.attack();
		scv.damaged(damage);
		scv.repair(scv);
		
		enemy = new Enemy("������");
		damage = enemy.attack();
		dropship.damaged(damage);
		scv.repair(dropship);
	}
}
