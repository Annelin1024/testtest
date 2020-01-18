
public class Dog implements getWeightMethod{
	private String name;
	private double weight;
	private int nothing;
	private String mastertohotfix;
	
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String getWeightmethod() {
		return "體重計";
//		System.out.print("體重計");
	}
	
	
}
