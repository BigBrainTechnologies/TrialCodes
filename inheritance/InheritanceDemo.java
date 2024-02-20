package basicPrograms.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		
		//direct objects
		Samsung s1 = new Samsung();
		s1.display();
		
		Apple a1 = new Apple();
		a1.display();
		
		
		Mobile m1 = new Mobile();
		m1.display();
		
		
		//base class object ref variable point out to 
		//derived class object
		Mobile m2 = new Samsung();
		m2.display();
		
		
		Mobile m3 = new Apple();
		m3.display();
		
		//TODO try with reverse 
		
		
		Mobile m4 = new Samsung();
		m4.display();
		
		
		m4 = new Apple();
		m4.display();
		
		
	}
}

class Mobile {
	protected String brandName;
	public void display() {
		System.out.println("((( Brand Name is )))" + brandName);
	}
	
}

class Samsung extends Mobile {
	
	
	private String additionalFeature1 = "additionalfeature";

	public Samsung() {
		// TODO Auto-generated constructor stub
		brandName = "Samsung";
	}
	public void display() {
		super.display();
		System.out.println("Unique to Samsung : additionalFeature1  is " + additionalFeature1);

	}
}


class Apple extends Mobile {
	
	
	private String additionalFeature1OfApple = "additionalFeature1OfApple";

	public Apple() {
		// TODO Auto-generated constructor stub
		brandName = "Apple";
	}
	public void display() {
		super.display();
		System.out.println("additionalFeature1OfApple  is " + additionalFeature1OfApple);

	}
}