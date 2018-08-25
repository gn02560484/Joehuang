package JavaJoe;

public class joe84 {

	public static void main(String[] args) {
		Player p1 = new Player();
		System.out.println(p1.getdir());
		p1.setdir(Direction.LEFT);
		System.out.println(p1.getdir());
		switch(p1.getdir()) {
			case STOP:
				System.out.println("A");break;
			case LEFT:
				System.out.println("B");break;
			case RIGHT:
				System.out.println("C");break;
			case UP:
				System.out.println("D");break;
			case DOWN:
				System.out.println("E");break;
		}
	}

}
enum Direction{    //列舉
	STOP,LEFT,RIGHT,UP,DOWN
}
class Player{
	private Direction dir;
	
	private final static int STATE_NEW = 1;    //也可以用這種方法來定義不變的參數
	
	void setdir(Direction dir) {
		this.dir = dir;
	}
	
	Direction getdir() {
		return this.dir;
	}
}
