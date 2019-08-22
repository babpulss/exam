
public class PetShop {

	private Cat[] cats = new Cat[3];
	public PetShop() {
		cats[0] = new Cat("����");
		cats[1] = new Cat("ġ��");
		cats[2] = new Cat("�ұ�");
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
