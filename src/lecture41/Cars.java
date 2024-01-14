package lecture41;

public class Cars implements Comparable<Cars> {

	int price;
	int speed;
	String color;
	
	public Cars(int price, int speed, String color) {
		this.price=price;
		this.speed=speed;
		this.color=color;
	}
	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C:" + this.color;
}
	@Override
	public int compareTo(Cars o) {
		return this.price - o.price;
	}
}