package StarCraft2;

class AirUnit extends Unit {
	public AirUnit(int hp, String name) {
		super(hp, name);
	}

	public void fly() {
		System.out.println("날아간다~");
	}
}