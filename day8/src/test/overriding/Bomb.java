package test.overriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		super.fire();//부모클래스의 fire 실행
		System.out.println("슈우ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ웅치칸웅치킨치킨이나드세요~");
	}
}
