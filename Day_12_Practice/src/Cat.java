
public class Cat {

	private String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.println(name + " : �ȳ�");
	}
	
	public void meow() {
		System.out.println("�Ŀ�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
