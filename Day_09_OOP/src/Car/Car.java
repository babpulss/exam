package Car;

public class Car {
	public static void main(String[] args) {
		Pedal myCarPedal = new Pedal();
		
		for (int i = 0; i < 10; i++)
		myCarPedal.attachGasPedal();
		
		for (int i = 0; i < 10; i++)
		myCarPedal.detachGasPedal();
		
		myCarPedal.brake();
	}
}
