
public class Cat {

	private String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.println(name + " : ³È³È");
	}
	
	public void meow() {
		System.out.println("³Ä¿Ë");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
