
public class PetShop {

	private Cat[] cats = new Cat[3];
	public PetShop() {
		cats[0] = new Cat("나비");
		cats[1] = new Cat("치즈");
		cats[2] = new Cat("소금");
	}

	public void listCats() {
		for(int i = 0; i < cats.length; i++) {
			System.out.print(cats[i].getName());
		}
	}
	
	public void feed(String food) {
		for (int i = 0; i < cats.length; i++) {
			cats[i].eat(food);
		}
	}
}
