package Car;

public class Pedal {
	private double speed = 0;
	private int fuel = 100;
	
	public void attachGasPedal() {
		System.out.println("Speed Up");
		speed++;
		fuel--;
	}
	
	public void detachGasPedal() {
		System.out.println("Speed Down");
		speed--;
	}
	
	public void brake() {
		speed = 0;
		System.out.println("Speed 0");
	}
}
