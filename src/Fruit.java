
public class Fruit {
	private String name;
	
	public Fruit() {
		this.name = "����";
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.getName());
	}

}
